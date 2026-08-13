// Last updated: 8/13/2026, 10:09:48 AM
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
16class
17 Solution {
18    int maxSum = Integer.MIN_VALUE;
19    public int maxPathSum(TreeNode root) {
20        solve(root);
21        return maxSum;
22    }
23
24    public int solve(TreeNode root) {
25
26        if (root == null) {
27            return 0;
28        }
29
30        int left = solve(root.left);
31        int right = solve(root.right);
32
33        left = Math.max(0, left);
34        right = Math.max(0, right);
35
36        int currentPath = left + root.val + right;
37
38        maxSum = Math.max(maxSum, currentPath);
39
40        return root.val + Math.max(left, right);
41    }
42}