// Last updated: 12/30/2025, 10:08:36 PM
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        int n = isConnected.length;
4
5        //create graph
6        HashMap<Integer, List<Integer>> map = new HashMap<>();
7        for(int i=1 ;i<=n ;i++){
8            map.put(i, new ArrayList<>());
9        }
10        for(int i=0; i<n ;i++){
11            for(int j=0 ;j<n ;j++){
12                if(i != j && isConnected[i][j] == 1){
13                    map.get(i+1).add(j+1);
14                    map.get(j+1).add(i+1);
15                }
16            }
17        }
18
19        Queue<Integer> q = new LinkedList<>();
20        HashSet<Integer> visited = new HashSet<>();
21        int count =0;
22
23        for(int src : map.keySet()){
24            if(visited.contains(src)){
25                continue;
26            }
27            count++;
28            q.add(src);
29
30            while(!q.isEmpty()){
31                // remove
32                int r = q.poll();
33
34                // ignore if visited
35                if(visited.contains(r)){
36                    continue;
37                }
38                // mark visited
39                visited.add(r);
40                // self work
41
42                // add unvisited nbrs
43                for(int nbrs : map.get(r)){
44                    if(!visited.contains(nbrs)){
45                        q.add(nbrs);
46                    }
47                }
48
49            }
50        }
51        return count;
52    }
53}