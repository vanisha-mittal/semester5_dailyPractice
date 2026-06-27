// Last updated: 6/27/2026, 11:03:10 PM
1class Solution {
2    public int shortestPathBinaryMatrix(int[][] grid) {
3        if(grid[0][0]==1) return -1;
4        Queue<Pair> q=new LinkedList<>();
5        boolean[][] vis=new boolean[grid.length][grid.length];
6        int[][] dir={{1,0},{0,1},{-1,0},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
7        q.add(new Pair(0,0));
8        int c=1;
9        while(!q.isEmpty()){
10            int size=q.size();
11            while(size-->0){
12                //1. remove
13                Pair p=q.poll();
14                //2. ignore
15                if(vis[p.x][p.y]) continue;
16                //3. mark vis
17                vis[p.x][p.y]=true;;
18                //4. self
19                if(p.x==grid.length-1 && p.y==grid.length-1) return c;
20                //5. add nbrs
21                for(int i=0;i<dir.length;i++){
22                    int px=p.x+dir[i][0];
23                    int py=p.y+dir[i][1];
24                    if(px>=0 && px<grid.length && py>=0 && py<grid.length && !vis[px][py] && grid[px][py]==0){
25                        q.add(new Pair(px,py));
26                    }
27                }
28            }
29            c++;
30        }
31        return -1;
32    }
33    class Pair{
34        int x;
35        int y;
36        public Pair(int x, int y){
37            this.x=x;
38            this.y=y;
39        }
40    }
41}