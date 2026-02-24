// Last updated: 2/24/2026, 12:10:52 PM
1class Solution {
2    public List<Boolean> checkIfPrerequisite(int n, int[][] prerequisites, int[][] queries) {
3        HashMap<Integer, List<Integer>> map = new HashMap<>();
4
5        for (int i = 0; i < n; i++) {
6            map.put(i, new ArrayList<>());
7        }
8        for (int[] p : prerequisites) {
9            int u = p[0];
10            int v = p[1];
11            map.get(u).add(v);   // directed edge
12        }
13        boolean[][] reachable = new boolean[n][n];
14        // BFS from every node
15        for (int i = 0; i < n; i++) {
16            bfs(i, map, reachable);
17        }
18
19        List<Boolean> ans = new ArrayList<>();
20        for (int[] q : queries) {
21            ans.add(reachable[q[0]][q[1]]);
22        }
23        return ans;
24    }
25
26    public void bfs(int src, HashMap<Integer, List<Integer>> map, boolean[][] reachable) {
27        Queue<Integer> q = new LinkedList<>();
28        boolean[] vis = new boolean[reachable.length];
29
30        q.add(src);
31        vis[src] = true;
32
33        while (!q.isEmpty()) {
34            int node = q.poll();
35
36            for (int nbr : map.get(node)) {
37                if (!vis[nbr]) {
38                    reachable[src][nbr] = true; // important
39                    vis[nbr] = true;
40                    q.add(nbr);
41                }
42            }
43        }
44    }
45}