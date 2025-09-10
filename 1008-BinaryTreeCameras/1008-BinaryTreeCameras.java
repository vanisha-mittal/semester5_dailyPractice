// Last updated: 9/10/2025, 12:39:16 PM
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
    int camera=0;
    public int minCameraCover(TreeNode root) {
        // has camera=1, need camera=-1, covered =0
        int c=minCamera(root);
        if(c==-1){
            camera++;
        }
        return camera;
    }
    public int minCamera(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=minCamera(root.left);
        int right=minCamera(root.right);
        if(left==-1|| right==-1){
            camera++;
            return 1;
        }
        if(left==1||right==1){
            return 0;
        }
        return -1;
    }
}