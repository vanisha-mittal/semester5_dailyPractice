// Last updated: 6/28/2026, 5:00:46 PM
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
22    HashMap<Node,Node> hm=new HashMap<>();
23    public Node cloneGraph(Node node) {
24        if(node==null) return null;
25
26        Queue<Node> q=new LinkedList<>();
27        HashSet<Node> vis=new HashSet<>();
28        q.add(node);
29        while(!q.isEmpty()){
30            //1. remove
31            Node curr=q.poll();
32            //2. ignore
33            if(vis.contains(curr)) continue;
34            //3. mark visited
35            vis.add(curr);
36            //4. self
37            hm.putIfAbsent(curr,new Node(curr.val));
38            for(Node nbr:curr.neighbors){
39                hm.putIfAbsent(nbr,new Node(nbr.val));
40            }
41
42            for(Node nbr:curr.neighbors){
43                hm.get(curr).neighbors.add(hm.get(nbr));
44            }
45            //5. add nbrs
46            for (Node nbr : curr.neighbors) {
47                if (!vis.contains(nbr)) {
48                    q.add(nbr);
49                }
50            }
51        }
52        return hm.get(node);
53    }
54}