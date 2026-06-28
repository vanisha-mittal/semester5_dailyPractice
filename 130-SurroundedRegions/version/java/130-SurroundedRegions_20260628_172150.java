// Last updated: 6/28/2026, 5:21:50 PM
1class Solution {
2    public void solve(char[][] board) {
3        int n=board.length;
4        int m=board[0].length;
5        Queue<Pair> q=new LinkedList<>();
6        boolean[][] vis=new boolean[n][m];
7        int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
8        for(int i=0;i<n;i++){
9            if(board[i][0]=='O'){
10                q.offer(new Pair(i,0));
11                vis[i][0]=true;
12            }
13            if(board[i][m-1]=='O'){
14                q.offer(new Pair(i,m-1));
15                vis[i][m-1]=true;
16            }
17        }
18
19        // Top & Bottom boundaries
20        for(int j=0;j<m;j++){
21            if(board[0][j]=='O'){
22                q.offer(new Pair(0,j));
23                vis[0][j]=true;
24            }
25            if(board[n-1][j]=='O'){
26                q.offer(new Pair(n-1,j));
27                vis[n-1][j]=true;
28            }
29        }
30        while(!q.isEmpty()){
31            Pair curr=q.poll();
32
33            for(int[] d:dir){
34                int nx=curr.x+d[0];
35                int ny=curr.y+d[1];
36
37                if(nx>=0 && nx<n && ny>=0 && ny<m &&
38                !vis[nx][ny] && board[nx][ny]=='O'){
39
40                    vis[nx][ny]=true;
41                    q.offer(new Pair(nx,ny));
42                }
43            }
44        }
45        for(int i=0;i<n;i++){
46    for(int j=0;j<m;j++){
47        if(board[i][j]=='O' && !vis[i][j])
48            board[i][j]='X';
49    }
50}
51    }
52    class Pair{
53        int x;
54        int y;
55        public Pair(int x, int y){
56            this.x=x;
57            this.y=y;
58        }
59    }
60}