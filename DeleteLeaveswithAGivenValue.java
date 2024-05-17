/* https://leetcode.com/problems/delete-leaves-with-a-given-value/?envType=daily-question&envId=2024-05-17 */
/* 1325. Delete Leaves With a Given Value */

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
class DeleteLeaveswithAGivenValue {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
    if (root == null)
      return null;
    root.left = removeLeafNodes(root.left, target);
    root.right = removeLeafNodes(root.right, target);
    return isLeaf(root) && root.val == target ? null : root;
  }

  private boolean isLeaf(TreeNode root) {
    return root.left == null && root.right == null;
    }
}
