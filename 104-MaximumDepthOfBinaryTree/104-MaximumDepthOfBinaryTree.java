// Last updated: 8/2/2025, 4:03:39 PM
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
    public int maxDepth(TreeNode root) {
        return ht(root);
    }
    private int ht(TreeNode nn) {
		if(nn==null) {
			return 0;
		}
		int lh=ht(nn.left);
		int rh=ht(nn.right);
		return Math.max(lh, rh)+1;
	}
}