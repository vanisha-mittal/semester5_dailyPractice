// Last updated: 12/31/2025, 11:13:41 PM
1class Solution {
2    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
3        int n = grid.size();
4        int m = grid.get(0).size();
5        
6        int[] dr = new int[] {0, 0, 1, -1};
7        int[] dc = new int[] {1, -1, 0, 0};
8        
9        boolean[][][] visited = new boolean[n][m][health + 1];
10        Queue<int[]> bfs = new LinkedList<>();
11        
12        bfs.add(new int[]{0, 0, health - grid.get(0).get(0)});
13        visited[0][0][health - grid.get(0).get(0)] = true;
14        
15        while(!bfs.isEmpty()) {
16            int size = bfs.size();
17            while(size-- > 0) {
18                int[] currNode = bfs.poll();
19                int r = currNode[0];
20                int c = currNode[1];
21                int h = currNode[2];
22               
23                if(r == n-1 && c == m-1 && h > 0) {
24                    return true;
25                }
26                 
27                for(int k = 0; k < 4; k++) {
28                    int nr = r + dr[k];
29                    int nc = c + dc[k];
30                    if(isValidMove(nr, nc, n, m)) {
31                        int nh = h - grid.get(nr).get(nc);
32                        if(nh >= 0 && visited[nr][nc][nh] == false) {
33                            visited[nr][nc][nh] = true;
34                            bfs.add(new int[]{nr, nc, nh});
35                        }
36                    }
37                }
38            }
39        }
40        
41        return false;
42    }
43    
44    private boolean isValidMove(int r, int c, int n, int m) {
45        return r >= 0 && c >= 0 && r < n && c < m;
46    }
47}