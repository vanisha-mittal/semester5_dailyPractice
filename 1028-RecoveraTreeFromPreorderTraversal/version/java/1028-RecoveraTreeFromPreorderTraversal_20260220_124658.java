// Last updated: 2/20/2026, 12:46:58 PM
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
17     public TreeNode recoverFromPreorder(String traversal) {
18        Stack<TreeNode> stack = new Stack<>();
19        int i = 0;
20
21        while (i < traversal.length()) {
22            int depth = 0;
23            while (i < traversal.length() && traversal.charAt(i) == '-') {
24                depth++;
25                i++;
26            }
27
28            int num = 0;
29            while (i < traversal.length() && Character.isDigit(traversal.charAt(i))) {
30                num = num * 10 + (traversal.charAt(i) - '0');
31                i++;
32            }
33
34            TreeNode node = new TreeNode(num);
35
36            while (stack.size() > depth) {
37                stack.pop();
38            }
39
40            if (!stack.isEmpty()) {
41                if (stack.peek().left == null) {
42                    stack.peek().left = node;
43                } else {
44                    stack.peek().right = node;
45                }
46            }
47
48            stack.push(node);
49        }
50
51        return stack.get(0);
52    }
53}