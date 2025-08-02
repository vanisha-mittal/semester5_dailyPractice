// Last updated: 8/2/2025, 4:03:09 PM
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preOrder(root, res);
        return res; 
    }

    static void preOrder(TreeNode node, List<Integer> res) {
        if (node == null) return;
        res.add(node.val);             
        preOrder(node.left, res);      
        preOrder(node.right, res);     
    }
}