/* https://leetcode.com/problems/delete-nodes-and-return-forest/?envType=daily-question&envId=2024-07-17 */
/* 1110. Delete Nodes And Return Forest */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class DeleteNodesAndReturnForest {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
    List<TreeNode> ans = new ArrayList<>();
    Set<Integer> toDeleteSet = Arrays.stream(to_delete).boxed().collect(Collectors.toSet());
    dfs(root, toDeleteSet, true, ans);
    return ans;
  }

  private TreeNode dfs(TreeNode root, Set<Integer> toDeleteSet, boolean isRoot,
                       List<TreeNode> ans) {
    if (root == null)
      return null;

    final boolean deleted = toDeleteSet.contains(root.val);
    if (isRoot && !deleted)
      ans.add(root);
    root.left = dfs(root.left, toDeleteSet, deleted, ans);
    root.right = dfs(root.right, toDeleteSet, deleted, ans);
    return deleted ? null : root;
    }
}
