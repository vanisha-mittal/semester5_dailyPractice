// Last updated: 2/8/2026, 10:45:55 PM
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
17    public boolean isBalanced(TreeNode root) {
18        return height(root) != -1;
19    }
20
21    private int height(TreeNode node) {
22        if (node == null) return 0;  // Base case: empty tree has height 0
23
24        // Recursively get the height of the left subtree
25        int leftHeight = height(node.left);
26        if (leftHeight == -1) return -1;  // If the left subtree is unbalanced, return -1
27
28        // Recursively get the height of the right subtree
29        int rightHeight = height(node.right);
30        if (rightHeight == -1) return -1;  // If the right subtree is unbalanced, return -1
31
32        // If the height difference between left and right subtrees is more than 1, return -1
33        if (Math.abs(leftHeight - rightHeight) > 1) return -1;
34
35        // Return the height of the current node
36        return Math.max(leftHeight, rightHeight) + 1;
37    }
38}