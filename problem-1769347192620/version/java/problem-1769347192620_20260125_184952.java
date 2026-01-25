// Last updated: 1/25/2026, 6:49:52 PM
1class TreeAncestor {
2    List <List <Integer>> adj; 
3    Map <Integer, List <Integer>> levelMap; 
4    Map <Integer, Integer> reverseLevelMap; 
5    int nodeCountMap[]; 
6    int counter; 
7    public TreeAncestor(int n, int[] parent) {
8        adj = new ArrayList <>();
9        levelMap = new HashMap <>();
10        nodeCountMap = new int[n];
11        reverseLevelMap = new HashMap <>();
12        counter = 0;
13        for (int i = 0; i < n; i++) {
14            adj.add(new ArrayList <>());
15        }
16        for (int i = 1; i < n; i++) {
17            int node = parent[i];
18            adj.get(node).add(i);
19        }
20        Queue <Integer> q = new LinkedList <>();
21        q.add(0);
22        int level = 0;
23        while (!q.isEmpty()) {
24            int size = q.size();
25            levelMap.put(level, new ArrayList <>());
26            for (int i = 0; i < size; i++) {
27                int node = q.poll();
28                levelMap.get(level).add(node);
29                reverseLevelMap.put(node, level);
30                adj.get(node).forEach(child -> q.add(child));
31            }
32            level ++;
33        }
34        dfs(0);
35    }
36
37    private int dfs(int node) {
38        counter ++;
39        int max[] = new int[]{counter};
40        adj.get(node).forEach(child -> max[0] = Math.max(max[0], dfs(child)));
41        nodeCountMap[node] = max[0];
42        return max[0];
43    }
44    
45    public int getKthAncestor(int node, int k) {
46        int currentLevel = reverseLevelMap.get(node);
47        if (k > currentLevel) {
48            return -1;
49        }
50        int levelToReach = currentLevel - k;
51        List <Integer> levelNodes = levelMap.get(levelToReach);
52        int numberOfNodeUnderCurrentNode = nodeCountMap[node];
53        return bs(levelNodes, numberOfNodeUnderCurrentNode);
54    }
55
56    private int bs(List <Integer> list, int x) {
57        int start = 0, end = list.size() - 1;
58        int result = -1;
59        while (start <= end) {
60            int mid = (start + end) / 2;
61            int node = list.get(mid);
62            if (nodeCountMap[node] < x) {
63                start = mid + 1;
64            } else {
65                result = node;
66                end = mid - 1;
67            }
68        }
69        return result;
70    }
71}
72
73/**
74 * Your TreeAncestor object will be instantiated and called as such:
75 * TreeAncestor obj = new TreeAncestor(n, parent);
76 * int param_1 = obj.getKthAncestor(node,k);
77 */
78
79