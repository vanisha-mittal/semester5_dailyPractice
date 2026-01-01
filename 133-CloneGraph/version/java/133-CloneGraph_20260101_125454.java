// Last updated: 1/1/2026, 12:54:54 PM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> neighbors;
6    public Node() {
7        val = 0;
8        neighbors = new ArrayList<Node>();
9    }
10    public Node(int _val) {
11        val = _val;
12        neighbors = new ArrayList<Node>();
13    }
14    public Node(int _val, ArrayList<Node> _neighbors) {
15        val = _val;
16        neighbors = _neighbors;
17    }
18}
19*/
20
21class Solution {
22
23    HashMap<Node, Node> map = new HashMap<>();
24
25    public Node cloneGraph(Node node) {
26        if (node == null) return null;
27
28        BFT(node);
29        return map.get(node);
30    }
31
32    public void BFT(Node node) {
33
34        Queue<Node> q = new LinkedList<>();
35        HashSet<Node> visited = new HashSet<>();
36
37        q.add(node);
38
39        while (!q.isEmpty()) {
40
41            // 1. remove
42            Node curr = q.poll();
43
44            // 2. ignore if visited
45            if (visited.contains(curr)) {
46                continue;
47            }
48
49            // 3. mark visited
50            visited.add(curr);
51
52            // 4. self work (clone node)
53            map.putIfAbsent(curr, new Node(curr.val));
54
55            // 5. clone neighbors (only create nodes)
56            for (Node nbr : curr.neighbors) {
57                map.putIfAbsent(nbr, new Node(nbr.val));
58            }
59
60            // 6. connect cloned neighbors
61            for (Node nbr : curr.neighbors) {
62                map.get(curr).neighbors.add(map.get(nbr));
63            }
64
65            // 7. add neighbors to queue
66            for (Node nbr : curr.neighbors) {
67                if (!visited.contains(nbr)) {
68                    q.add(nbr);
69                }
70            }
71        }
72    }
73}