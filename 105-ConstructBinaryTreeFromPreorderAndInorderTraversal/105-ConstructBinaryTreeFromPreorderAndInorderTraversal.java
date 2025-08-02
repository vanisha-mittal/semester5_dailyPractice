// Last updated: 8/2/2025, 4:03:37 PM
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
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) return null;

        int rootVal = preorder[0];
        int index = 0;

        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootVal) {
                index = i;
                break;
            }
        }

        TreeNode root = new TreeNode(rootVal);

        root.left = buildTree(
            Arrays.copyOfRange(preorder, 1, index + 1),
            Arrays.copyOfRange(inorder, 0, index)
        );

        root.right = buildTree(
            Arrays.copyOfRange(preorder, index + 1, preorder.length),
            Arrays.copyOfRange(inorder, index + 1, inorder.length)
        );

        return root;
    }
}