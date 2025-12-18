// Last updated: 12/18/2025, 7:38:21 PM
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
17    public boolean findTarget(TreeNode root, int k) {
18        Set<Integer> set=new HashSet<>();
19        return helper(root,k,set);
20    }
21    public boolean helper(TreeNode node,int k,Set<Integer> seen){
22        if(node==null)return false;
23        if(seen.contains(k-node.val))return true;
24        seen.add(node.val);
25        return helper(node.left,k,seen)||helper(node.right,k,seen);
26    }
27}