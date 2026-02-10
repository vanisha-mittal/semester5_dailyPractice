// Last updated: 2/10/2026, 2:33:12 PM
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
17    public TreeNode reverseOddLevels(TreeNode root) {
18        if (root == null) return root;
19        dfs(root.left, root.right, 1);
20        return root;
21    }
22
23    private void dfs(TreeNode left, TreeNode right, int level) {
24        if (left == null || right == null) return;
25
26        if (level % 2!=0) {
27            int temp = left.val;
28            left.val = right.val;
29            right.val = temp;
30        }
31
32        dfs(left.left, right.right, level + 1);
33        dfs(left.right, right.left, level + 1);
34    }
35}
36