// Last updated: 1/7/2026, 10:48:22 PM
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
17    long totalSum = 0;
18    long maxProd = 0;
19    static final int MOD = 1_000_000_007;
20
21    private void dfsTotal(TreeNode root) {
22        if (root == null) return;
23        totalSum += root.val;
24        dfsTotal(root.left);
25        dfsTotal(root.right);
26    }
27
28    private long dfs(TreeNode root) {
29        if (root == null) return 0;
30
31        long left = dfs(root.left);
32        long right = dfs(root.right);
33
34        long subSum = left + right + root.val;
35        maxProd = Math.max(maxProd, subSum * (totalSum - subSum));
36
37        return subSum;
38    }
39
40    public int maxProduct(TreeNode root) {
41        dfsTotal(root);
42        dfs(root);
43        return (int)(maxProd % MOD);
44    }
45}