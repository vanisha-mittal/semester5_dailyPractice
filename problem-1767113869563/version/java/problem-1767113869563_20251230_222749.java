// Last updated: 12/30/2025, 10:27:49 PM
1class Solution {
2    public int minCost(int n, int[][] edges) {
3         List<List<int[]>> adj = new ArrayList<>();
4        for(int i = 0; i < n; i++){
5            adj.add(new ArrayList<>());
6        }
7        for(int[] e : edges){
8            int u = e[0];
9            int v = e[1];
10            int w = e[2];
11            adj.get(u).add(new int[]{v, w});
12            adj.get(v).add(new int[]{u, 2 * w});
13        }
14        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
15        pq.add(new int[]{0, 0});
16        int[] dis = new int[n];
17        Arrays.fill(dis, Integer.MAX_VALUE);
18        while(!pq.isEmpty()){
19            int[] curr = pq.poll();
20            int node = curr[0];
21            int d = curr[1];
22            if(dis[node] < d){
23                continue;
24            }
25            for(int[] nbr : adj.get(node)){
26                int nn = nbr[0];
27                int wt = nbr[1];
28                if(d + wt < dis[nn]){
29                    dis[nn] = d + wt;
30                    pq.add(new int[]{nn, dis[nn]});
31                }
32            }
33        }
34        return dis[n - 1] == Integer.MAX_VALUE ? -1 : dis[n - 1]; 
35    }
36}