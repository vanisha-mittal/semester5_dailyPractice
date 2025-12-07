// Last updated: 12/7/2025, 3:44:12 PM
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
17    public int rob(TreeNode root) {
18        int [] res = dfs(root);
19        return Math.max(res[0], res[1]);
20    }
21
22    int[] dfs (TreeNode n) {
23        if(n==null) return new int[]{0,0};
24        int [] l = dfs(n.left);
25        int [] r = dfs(n.right);
26
27        int [] res = new int [2];
28        res[0] = Math.max(l[0],l[1]) + Math.max(r[0],r[1]);
29        res[1] = n.val + l[0] + r[0];
30        return res;
31    }
32}