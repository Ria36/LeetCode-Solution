/* https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/ */
/*
103. Binary Tree Zigzag Level Order Traversal

Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]

Example 2:
Input: root = [1]
Output: [[1]]

Example 3:
Input: root = []
Output: []
 
Constraints:
The number of nodes in the tree is in the range [0, 2000].
-100 <= Node.val <= 100
*/

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
class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null)
      return new ArrayList<>();

    List<List<Integer>> ans = new ArrayList<>();
    Deque<TreeNode> q = new ArrayDeque<>(Arrays.asList(root));
    boolean isLeftToRight = true;

    while (!q.isEmpty()) {
      List<Integer> currLevel = new ArrayList<>();
      for (int sz = q.size(); sz > 0; --sz) {
        TreeNode node = q.poll();
        if (isLeftToRight)
          currLevel.add(node.val);
        else
          currLevel.add(0, node.val);
        if (node.left != null)
          q.offer(node.left);
        if (node.right != null)
          q.offer(node.right);
      }
      ans.add(currLevel);
      isLeftToRight = !isLeftToRight;
    }

    return ans;
    }
}
