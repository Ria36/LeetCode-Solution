/* https://leetcode.com/problems/sum-of-left-leaves/?envType=daily-question&envId=2024-04-14 */
/* 404. Sum of Left Leaves */

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
class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
    if (root == null)
      return 0;

    int ans = 0;
    Deque<TreeNode> stack = new ArrayDeque<>();
    stack.push(root);

    while (!stack.isEmpty()) {
      root = stack.pop();
      if (root.left != null) {
        if (root.left.left == null && root.left.right == null)
          ans += root.left.val;
        else
          stack.push(root.left);
      }
      if (root.right != null)
        stack.push(root.right);
    }

    return ans;
    }
}
