// Last updated: 1/3/2026, 4:21:41 PM
1class Solution {
2    public boolean possibleBipartition(int n, int[][] dislikes) {
3        List<List<Integer>> graph=new ArrayList<>();
4        for (int i = 0; i <= n; i++) {
5            graph.add(new ArrayList<>());
6        }
7        for (int[] d : dislikes) {
8            graph.get(d[0]).add(d[1]);
9            graph.get(d[1]).add(d[0]);
10        }
11        return isBipartite(graph);
12    }
13    public boolean isBipartite(List<List<Integer>> graph) {
14			
15			Queue<BipartitePair> q = new LinkedList<>();
16			HashMap<Integer, Integer> visited = new HashMap<>();
17			for (int i = 0; i < graph.size(); i++) {// vtx
18				if (visited.containsKey(i)) {
19					continue;
20				}
21				q.add(new BipartitePair(i, 0));
22				while (!q.isEmpty()) {
23					// 1. remove
24					BipartitePair rp = q.poll();
25					// 2. Ignore if Alredv visited
26					if (visited.containsKey(rp.vtx)) {
27						if (visited.get(rp.vtx) != rp.dis) {
28							return false;
29						}
30						continue;
31
32					}
33					// 3. makred visited
34					visited.put(rp.vtx, rp.dis);
35					// 4. self work
36					 
37					// 5. Add unvisited nbrs
38					for (int nbrs : graph.get(rp.vtx)) {
39						if (!visited.containsKey(nbrs)) {
40							q.add(new BipartitePair(nbrs, rp.dis + 1));
41						}
42					}
43				}
44			}
45			return true;
46
47		}
48        class BipartitePair {
49		int vtx;
50		int dis;
51
52		public BipartitePair(int vtx, int dis) {
53			// TODO Auto-generated constructor stub
54			this.vtx = vtx;
55			this.dis = dis;
56		}
57	}
58}