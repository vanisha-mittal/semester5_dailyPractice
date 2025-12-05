// Last updated: 12/5/2025, 7:15:31 PM
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
16public class BSTIterator {
17    private Stack<TreeNode> stack = new Stack<TreeNode>();
18    
19    public BSTIterator(TreeNode root) {
20        pushAll(root);
21    }
22    public boolean hasNext() {
23        return !stack.isEmpty();
24    }
25
26    public int next() {
27        TreeNode tmpNode = stack.pop();
28        pushAll(tmpNode.right);
29        return tmpNode.val;
30    }
31    
32    private void pushAll(TreeNode node) {
33        for (; node != null; stack.push(node), node = node.left);
34    }
35}
36/**
37 * Your BSTIterator object will be instantiated and called as such:
38 * BSTIterator obj = new BSTIterator(root);
39 * int param_1 = obj.next();
40 * boolean param_2 = obj.hasNext();
41 */