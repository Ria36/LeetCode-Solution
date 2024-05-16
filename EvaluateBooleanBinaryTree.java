/* https://leetcode.com/problems/evaluate-boolean-binary-tree/?envType=daily-question&envId=2024-05-16 */
/* 2331. Evaluate Boolean Binary Tree */

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
class EvaluateBooleanBinaryTree {
    public boolean evaluateTree(TreeNode root) {
    if (root.val < 2)
      return root.val == 1;
    if (root.val == 2) // OR
      return evaluateTree(root.left) || evaluateTree(root.right);
    // AND
    return evaluateTree(root.left) && evaluateTree(root.right);
    }
}
