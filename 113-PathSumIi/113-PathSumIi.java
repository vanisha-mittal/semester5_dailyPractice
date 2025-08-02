// Last updated: 8/2/2025, 4:03:29 PM
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ll=new ArrayList<>();
        path(root,targetSum,new ArrayList<Integer>(),ll);
        return ll;
    }
    public static void path(TreeNode root, int targetSum,ArrayList<Integer> ans,List<List<Integer>> ll){
        if(root==null){
            return ;
        }
        if(root.left==null && root.right==null){
            if(targetSum-root.val==0){
                ans.add(root.val);
                ll.add(new ArrayList<>(ans));
                ans.remove(ans.size()-1);
            }
            return;
        }
        ans.add(root.val);
        path(root.left, targetSum-root.val,ans,ll);
        path(root.right, targetSum-root.val,ans,ll);
        ans.remove(ans.size()-1);
    }
}