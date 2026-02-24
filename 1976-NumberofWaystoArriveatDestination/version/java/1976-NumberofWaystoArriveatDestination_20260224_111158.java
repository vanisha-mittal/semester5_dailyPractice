// Last updated: 2/24/2026, 11:11:58 AM
1class Solution {
2    static final int MOD = 1_000_000_007;
3
4    public int countPaths(int n, int[][] roads) {
5        List<int[]>[] graph = new ArrayList[n];
6        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
7
8        for (int[] r : roads) {
9            graph[r[0]].add(new int[]{r[1], r[2]});
10            graph[r[1]].add(new int[]{r[0], r[2]});
11        }
12
13        long[] dist = new long[n];
14        Arrays.fill(dist, Long.MAX_VALUE);
15        int[] ways = new int[n];
16
17        PriorityQueue<long[]> pq =
18                new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
19
20        dist[0] = 0;
21        ways[0] = 1;
22        pq.add(new long[]{0, 0}); 
23
24        while (!pq.isEmpty()) {
25            long[] cur = pq.poll();
26            long d = cur[0];
27            int node = (int) cur[1];
28
29            if (d > dist[node]) continue;
30
31            for (int[] e : graph[node]) {
32                int next = e[0];
33                long newDist = d + e[1];
34
35                if (newDist < dist[next]) {
36                    dist[next] = newDist;
37                    ways[next] = ways[node];
38                    pq.add(new long[]{newDist, next});
39                } 
40                else if (newDist == dist[next]) {
41                    ways[next] = (ways[next] + ways[node]) % MOD;
42                }
43            }
44        }
45
46        return ways[n - 1];
47    }
48}