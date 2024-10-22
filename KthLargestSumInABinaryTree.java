/* https://leetcode.com/problems/kth-largest-sum-in-a-binary-tree/submissions/1430456305/?envType=daily-question&envId=2024-10-22 */
/* 2583. Kth Largest Sum in a Binary Tree */

class Solution {
  public long kthLargestLevelSum(TreeNode root, int k) {
    List<Long> levelSums = new ArrayList<>();
    dfs(root, 0, levelSums);
    if (levelSums.size() < k)
      return -1;

    Collections.sort(levelSums, Collections.reverseOrder());
    return levelSums.get(k - 1);
  }

  private void dfs(TreeNode root, int level, List<Long> levelSums) {
    if (root == null)
      return;
    if (levelSums.size() == level)
      levelSums.add(0L);
    levelSums.set(level, levelSums.get(level) + root.val);
    dfs(root.left, level + 1, levelSums);
    dfs(root.right, level + 1, levelSums);
  }
}
