// Last updated: 2/20/2026, 11:36:03 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public TreeNode removeLeafNodes(TreeNode root, int target) {
18        return del(root,target);
19    }
20    public TreeNode del(TreeNode root, int target){
21        if(root==null) return null;
22
23        root.left=del(root.left,target);
24        root.right=del(root.right,target);
25
26        if(root.left==null && root.right==null && root.val==target){
27            return null;
28        }
29
30        return root;
31    }
32}