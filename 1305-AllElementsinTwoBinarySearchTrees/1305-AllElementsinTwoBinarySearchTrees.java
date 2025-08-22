// Last updated: 8/22/2025, 7:15:37 PM
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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        inOrder(root1, l1);
        inOrder(root2, l2);

        int i=0, j=0;
        while(i<l1.size() && j<l2.size()){
            if(l1.get(i) < l2.get(j)){
                result.add(l1.get(i++));
            } else {
                result.add(l2.get(j++));
            }
        } 
        while(i<l1.size()) {
            result.add(l1.get(i++));
        }
        while(j<l2.size()) {
            result.add(l2.get(j++));
        }

        return result;
    }

    public void inOrder(TreeNode root, List<Integer> list){
        if(root == null) return;

        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
}