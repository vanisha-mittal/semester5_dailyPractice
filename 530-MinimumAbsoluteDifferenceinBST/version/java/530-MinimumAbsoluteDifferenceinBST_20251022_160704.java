// Last updated: 10/22/2025, 4:07:04 PM
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
    int ans = Integer.MAX_VALUE; 
    TreeNode pre = null;
    
    public void getMinimumDifferenceHelper(TreeNode root) {
        if (root == null) return;
        
        getMinimumDifferenceHelper(root.left);
                if (pre != null) {
            ans = Math.min(ans, root.val - pre.val);
        }
        pre = root;
        
        getMinimumDifferenceHelper(root.right);
    }
    
    public int getMinimumDifference(TreeNode root) {
        getMinimumDifferenceHelper(root);
        return ans;
    }
}