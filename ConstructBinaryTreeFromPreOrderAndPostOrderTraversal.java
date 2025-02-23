/* https://leetcode.com/problems/construct-binary-tree-from-preorder-and-postorder-traversal/?envType=daily-question&envId=2025-02-23 */
/* 889. Construct Binary Tree from Preorder and Postorder Traversal */

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
/* left --> root --> right */

class ConstructBinaryTreeFromPreOrderAndPostOrderTraversal {
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
    Map<Integer, Integer> postToIndex = new HashMap<>();
    for (int i = 0; i < postorder.length; ++i)
      postToIndex.put(postorder[i], i);
    return build(preorder, 0, preorder.length - 1, postorder, 0, postorder.length - 1, postToIndex);
    }

    private TreeNode build(int[] preorder, int preStart, int preEnd, int[] postorder, int postStart,
                         int postEnd, Map<Integer, Integer> postToIndex) {
    if (preStart > preEnd)
      return null;
    if (preStart == preEnd)
      return new TreeNode(preorder[preStart]);

    final int rootVal = preorder[preStart];
    final int leftRootVal = preorder[preStart + 1];
    final int leftRootPostIndex = postToIndex.get(leftRootVal);
    final int leftSize = leftRootPostIndex - postStart + 1;

    TreeNode root = new TreeNode(rootVal);
    root.left = build(preorder, preStart + 1, preStart + leftSize, postorder, postStart, leftRootPostIndex,
                      postToIndex);
    root.right = build(preorder, preStart + leftSize + 1, preEnd, postorder, leftRootPostIndex + 1,
                       postEnd - 1, postToIndex);
    return root;
  }
}
