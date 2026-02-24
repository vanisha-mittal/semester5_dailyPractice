// Last updated: 2/24/2026, 10:21:49 AM
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
17    public int sumRootToLeaf(TreeNode root) {
18        return sumRootToLeaf(root, 0);
19    }
20    public int sumRootToLeaf(TreeNode root, int sum){
21        if(root == null){
22            return 0;
23        }
24        sum = (2 * sum) + root.val;
25        if(root.left == null && root.right == null) return sum;
26        return sumRootToLeaf(root.left, sum) + sumRootToLeaf(root.right, sum);
27    }
28}