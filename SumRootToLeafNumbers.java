/* https://leetcode.com/problems/sum-root-to-leaf-numbers/?envType=daily-question&envId=2024-04-15 */
/* 129. Sum Root to Leaf Numbers */

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
class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
    dfs(root, 0);
    return ans;
  }

  private int ans = 0;

  private void dfs(TreeNode root, int path) {
    if (root == null)
      return;
    if (root.left == null && root.right == null) {
      ans += path * 10 + root.val;
      return;
    }

    dfs(root.left, path * 10 + root.val);
    dfs(root.right, path * 10 + root.val);
    }
}
