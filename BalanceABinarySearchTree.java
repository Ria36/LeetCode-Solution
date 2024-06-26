/* https://leetcode.com/problems/balance-a-binary-search-tree/description/?envType=daily-question&envId=2024-06-26 */
/* 1382. Balance a Binary Search Tree */

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
class BalanceABinarySearchTree {
    public TreeNode balanceBST(TreeNode root) {
    List<Integer> nums = new ArrayList<>();
    inorder(root, nums);
    return build(nums, 0, nums.size() - 1);
  }
  private void inorder(TreeNode root, List<Integer> nums) {
    if (root == null)
      return;
    inorder(root.left, nums);
    nums.add(root.val);
    inorder(root.right, nums);
  }
  private TreeNode build(List<Integer> nums, int l, int r) {
    if (l > r)
      return null;
    final int m = (l + r) / 2;
    return new TreeNode(nums.get(m), build(nums, l, m - 1), build(nums, m + 1, r));
    }
}
