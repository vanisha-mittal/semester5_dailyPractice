// Last updated: 1/2/2026, 10:35:23 PM
1class Solution {
2    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
3        int[] res = new int[n];
4        Arrays.fill(res, Integer.MAX_VALUE);
5        res[0] = 0;
6        Map<Integer, Queue<int[]>> map = new HashMap<>();
7        for(int i=0;i<n;i++){
8            map.put(i, new LinkedList<int[]>());
9        }
10        for(int[] edge : edges){
11            map.get(edge[0]).offer(new int[]{edge[0], edge[1], edge[2]});
12            map.get(edge[1]).offer(new int[]{edge[1], edge[0], edge[2]});
13        }
14        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->a[1]-b[1]);
15        q.offer(new int[]{0,0});
16        while(!q.isEmpty()){
17            int[] arr = q.poll();
18            int source = arr[0];
19            int time = arr[1];    
20            if(time < disappear[source]){
21                res[source] = Math.min(res[source], time);
22                Queue<int[]> pq = map.get(source);
23                while(!pq.isEmpty()){
24                    int[] nn = pq.poll();    
25                    q.offer(new int[]{nn[1], nn[2]+time});
26                }
27            }
28        }
29        for(int i=0;i<res.length;i++){
30            if(res[i]==Integer.MAX_VALUE){
31                res[i] = -1;
32            }
33        }    
34        return res;
35    }
36}