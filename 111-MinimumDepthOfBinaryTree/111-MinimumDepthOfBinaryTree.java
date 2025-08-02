// Last updated: 8/2/2025, 4:03:31 PM
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
    public int minDepth(TreeNode nn) {
        if(nn==null) {
			return 0;
		}
        if(nn.left==null){
            return minDepth(nn.right)+1;
        }
        if(nn.right==null){
            return minDepth(nn.left)+1;
        }
		int lh=minDepth(nn.left);
		int rh=minDepth(nn.right);
		return Math.min(lh, rh)+1;
    }
}