// Last updated: 11/30/2025, 9:17:24 PM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node left;
6    public Node right;
7    public Node next;
8
9    public Node() {}
10    
11    public Node(int _val) {
12        val = _val;
13    }
14
15    public Node(int _val, Node _left, Node _right, Node _next) {
16        val = _val;
17        left = _left;
18        right = _right;
19        next = _next;
20    }
21};
22*/
23
24class Solution {
25    public Node connect(Node root) {
26        if (root == null) return root;
27
28        Queue<Node> q = new LinkedList<>();
29        q.add(root);
30
31        while (!q.isEmpty()) {
32            int level = q.size();
33            while (level-- > 0) {
34                Node curr = q.poll();
35                if (level != 0) curr.next = q.peek();
36                if (curr.left != null) q.add(curr.left);
37                if (curr.right != null) q.add(curr.right);
38            }
39        }
40
41        return root;
42    }
43}