// Last updated: 2/24/2026, 3:41:23 PM
1class Solution {
2    public int countPaths(int n, int[][] roads) {
3        HashMap<Integer, HashMap<Integer, Integer>> graph = new HashMap<>();
4        for (int i = 0; i < n; i++) {
5            graph.put(i, new HashMap<>());
6        }
7        for (int[] r : roads) {
8            graph.get(r[0]).put(r[1], r[2]);
9            graph.get(r[1]).put(r[0], r[2]);
10        }
11
12        long[] dist = new long[n];
13        int[] ways = new int[n];
14
15        Arrays.fill(dist, Long.MAX_VALUE);
16
17        dist[0] = 0;
18        ways[0] = 1;
19
20        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[1], b[1]));
21
22        pq.add(new long[] { 0, 0 });
23
24        int mod = 1000000007;
25
26        while (!pq.isEmpty()) {
27            long[] curr = pq.poll();
28            int node = (int) curr[0];
29            long d = curr[1];
30
31            if (d > dist[node])
32                continue;
33
34            for (int nbr : graph.get(node).keySet()) {
35                long dis = d + graph.get(node).get(nbr);
36
37                if (dis < dist[nbr]) {
38                    dist[nbr] = dis;
39                    ways[nbr] = ways[node];
40                    pq.add(new long[] { nbr, dis });
41                } else if (dis == dist[nbr]) {
42                    ways[nbr] = (ways[nbr] + ways[node]) % mod;
43                }
44            }
45        }
46
47        return ways[n - 1];
48    }
49}