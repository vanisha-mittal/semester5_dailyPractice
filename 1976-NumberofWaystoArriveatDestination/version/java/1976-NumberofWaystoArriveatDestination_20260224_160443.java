// Last updated: 2/24/2026, 4:04:43 PM
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
11        int mod=1000000007;
12        long[] dist=new long[n];
13        int[] ways=new int[n];
14        Arrays.fill(dist,Long.MAX_VALUE);
15
16        dist[0]=0;
17        ways[0]=1;
18
19        PriorityQueue<long[]> pq=new PriorityQueue<>((a,b)-> Long.compare(a[1],b[1]));
20
21        pq.add(new long[]{0,0});
22
23        while(!pq.isEmpty()){
24            long[] curr=pq.poll();
25            int node=(int) curr[0];
26            long d=curr[1];
27            if(d>dist[node]) continue;
28
29            for(int nbrs:graph.get(node).keySet()){
30                long dis=d+graph.get(node).get(nbrs);
31                if(dis<dist[nbrs]){
32                    dist[nbrs]=dis;
33                    ways[nbrs]=ways[node];
34                    pq.add(new long[]{nbrs, dis});
35                }
36                else if(dis== dist[nbrs]){
37                    ways[nbrs]=(ways[nbrs]+ways[node])%mod;
38                }
39            }
40        }
41        return (int)ways[n-1];
42    }
43}