// Last updated: 8/13/2025, 12:43:49 PM
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
    public void flatten(TreeNode root) {
        makell(root);
    }
    public TreeNode makell(TreeNode root){
        if(root==null){
            return null;
        }
        if(root.left==null && root.right==null){
            return root;
        }
        TreeNode lt=makell(root.left);
        TreeNode rt=makell(root.right);
        if(root.left!=null){
            lt.right=root.right;
            root.right=root.left;
            root.left=null;
        }
        
        return rt!=null?rt:lt;
    }
}