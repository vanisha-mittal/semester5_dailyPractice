// Last updated: 6/28/2026, 7:42:47 PM
1class Solution {
2
3    class Pair {
4        int x, y;
5
6        Pair(int x, int y) {
7            this.x = x;
8            this.y = y;
9        }
10    }
11
12    int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
13
14    public List<List<Integer>> pacificAtlantic(int[][] heights) {
15
16        int n = heights.length;
17        int m = heights[0].length;
18
19        boolean[][] pacific = new boolean[n][m];
20        boolean[][] atlantic = new boolean[n][m];
21
22        Queue<Pair> pq = new LinkedList<>();
23        Queue<Pair> aq = new LinkedList<>();
24
25        // Pacific: top row
26        for(int j = 0; j < m; j++){
27            pq.offer(new Pair(0, j));
28            pacific[0][j] = true;
29        }
30
31        // Pacific: left column
32        for(int i = 0; i < n; i++){
33            if(!pacific[i][0]){
34                pq.offer(new Pair(i, 0));
35                pacific[i][0] = true;
36            }
37        }
38
39        // Atlantic: bottom row
40        for(int j = 0; j < m; j++){
41            aq.offer(new Pair(n - 1, j));
42            atlantic[n - 1][j] = true;
43        }
44
45        // Atlantic: right column
46        for(int i = 0; i < n; i++){
47            if(!atlantic[i][m - 1]){
48                aq.offer(new Pair(i, m - 1));
49                atlantic[i][m - 1] = true;
50            }
51        }
52
53        bfs(pq, pacific, heights);
54        bfs(aq, atlantic, heights);
55
56        List<List<Integer>> ans = new ArrayList<>();
57
58        for(int i = 0; i < n; i++){
59            for(int j = 0; j < m; j++){
60                if(pacific[i][j] && atlantic[i][j]){
61                    ans.add(Arrays.asList(i, j));
62                }
63            }
64        }
65
66        return ans;
67    }
68
69    private void bfs(Queue<Pair> q, boolean[][] vis, int[][] heights){
70
71        int n = heights.length;
72        int m = heights[0].length;
73
74        while(!q.isEmpty()){
75
76            Pair curr = q.poll();
77
78            for(int[] d : dir){
79
80                int nx = curr.x + d[0];
81                int ny = curr.y + d[1];
82
83                if(nx >= 0 && nx < n &&
84                   ny >= 0 && ny < m &&
85                   !vis[nx][ny] &&
86                   heights[nx][ny] >= heights[curr.x][curr.y]){
87
88                    vis[nx][ny] = true;
89                    q.offer(new Pair(nx, ny));
90                }
91            }
92        }
93    }
94}