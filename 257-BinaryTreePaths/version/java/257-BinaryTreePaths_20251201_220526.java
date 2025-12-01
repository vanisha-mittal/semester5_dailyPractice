// Last updated: 12/1/2025, 10:05:26 PM
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
17    public List<String> binaryTreePaths(TreeNode root) {
18        List<String> answer = new ArrayList<String>();
19        if (root != null) searchBT(root, "", answer);
20        return answer;
21    }
22    private void searchBT(TreeNode root, String path, List<String> answer) {
23        if (root.left == null && root.right == null) answer.add(path + root.val);
24        if (root.left != null) searchBT(root.left, path + root.val + "->", answer);
25        if (root.right != null) searchBT(root.right, path + root.val + "->", answer);
26    }
27}