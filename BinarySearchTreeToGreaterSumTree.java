/* https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/?envType=daily-question&envId=2024-06-25 */
/* 1038. Binary Search Tree to Greater Sum Tree */

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
class BinarySearchTreeToGreaterSumTree {
    public TreeNode bstToGst(TreeNode root) {
        int sum = 0; 
        TreeNode currentNode = root; 
        while (root != null) {      
            if (root.right == null) {
                sum += root.val; 
                root.val = sum;
                root = root.left;
            } else {
                TreeNode inorderSuccessor = root.right;
                while (inorderSuccessor.left != null && inorderSuccessor.left != root) {
                    inorderSuccessor = inorderSuccessor.left;
                }
                if (inorderSuccessor.left == null) {
                    inorderSuccessor.left = root;
                    root = root.right;
                } else {
                    sum += root.val; 
                    root.val = sum;
                    inorderSuccessor.left = null; 
                    root = root.left; 
                }
            }
        }
        return currentNode;
    }
}
