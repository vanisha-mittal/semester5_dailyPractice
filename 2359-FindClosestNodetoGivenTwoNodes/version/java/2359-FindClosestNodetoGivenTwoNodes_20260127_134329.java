// Last updated: 1/27/2026, 1:43:29 PM
1class Solution {
2    public int[] dfs(int[] edges, int start) {
3        int[] dist = new int[edges.length];
4        Arrays.fill(dist, -1);
5        int d = 0;
6        while (start != -1 && dist[start] == -1) {
7            dist[start] = d++;
8            start = edges[start];
9        }
10        return dist;
11    }
12
13    public int closestMeetingNode(int[] edges, int node1, int node2) {
14        int[] dist1 = dfs(edges, node1);
15        int[] dist2 = dfs(edges, node2);
16        int result = -1;
17        int minDist = Integer.MAX_VALUE;
18
19        for (int i = 0; i < edges.length; i++) {
20            if (dist1[i] != -1 && dist2[i] != -1) {
21                int maxDist = Math.max(dist1[i], dist2[i]);
22                if (maxDist < minDist) {
23                    minDist = maxDist;
24                    result = i;
25                }
26            }
27        }
28
29        return result;
30    }
31}