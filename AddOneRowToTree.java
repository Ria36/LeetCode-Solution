/* https://leetcode.com/problems/add-one-row-to-tree/?envType=daily-question&envId=2024-04-16 */
/* 623. Add One Row to Tree */

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
class AddOneRowToTree {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        } else {
            dfs(root, val, depth);
            return root;
        }

    }

    private void dfs(TreeNode root, int v, int d) {

        if (root == null) {
            return;
        }

        if (d == 2) {

            TreeNode newLeft = new TreeNode(v);
            TreeNode newRight = new TreeNode(v);
            newLeft.left = root.left;
            newRight.right = root.right;
            root.left = newLeft;
            root.right = newRight;

        } else {
            dfs(root.left, v, d - 1);
            dfs(root.right, v, d - 1);
        }
    }
}
