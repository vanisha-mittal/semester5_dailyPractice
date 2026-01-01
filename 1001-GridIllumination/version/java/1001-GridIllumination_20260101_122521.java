// Last updated: 1/1/2026, 12:25:21 PM
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18        if (head == null) return null;
19        
20        HashMap<Node, Node> hm = new HashMap<>();
21        
22        Node temp = head;
23        while (temp != null) {
24            hm.put(temp, new Node(temp.val));
25            temp = temp.next;
26        }
27        
28        temp = head;
29        while (temp != null) {
30            hm.get(temp).next = hm.get(temp.next);
31            hm.get(temp).random = hm.get(temp.random);
32            temp = temp.next;
33        }
34        
35        return hm.get(head);
36    }
37}