// Last updated: 3/29/2026, 9:50:26 PM
1class Solution {
2    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
3        while (root != null) {
4            if (p.val > root.val && q.val > root.val) {
5                root = root.right;
6            } else if (p.val < root.val && q.val < root.val) {
7                root = root.left;
8            } else {
9                return root;
10            }
11        }
12        return null;        
13    }
14}