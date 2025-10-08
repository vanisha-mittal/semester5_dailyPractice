// Last updated: 10/8/2025, 10:27:10 AM
class Solution {
    class Pair{
        int row,col,time;
        Pair(int r,int c,int t){
            row=r;
            col=c;
            time=t;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int[] row={1,-1,0,0};
        int[] col={0,0,-1,1};
        int maxTime=0;
        while(!q.isEmpty()){
            Pair curr=q.poll();
            int r=curr.row;
            int c=curr.col;
            int time=curr.time;
            maxTime=Math.max(maxTime,time);

            for(int k=0;k<4;k++){
                if(r+row[k]>=0 && r+row[k]<grid.length && c+col[k]>=0 && c+col[k]<grid[0].length && grid[r+row[k]][c+col[k]]==1){
                    grid[r+row[k]][c+col[k]]=2;
                    q.add(new Pair(r+row[k],c+col[k],time+1));
                    fresh--;
                }
            }
        }
        return fresh==0?maxTime:-1;
    }
}