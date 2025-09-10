// Last updated: 9/10/2025, 12:39:20 PM
class Solution {
    public int minFallingPathSum(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        for(int[] i:dp){
            Arrays.fill(i,-1000000);
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<grid[0].length;i++){
            int a=Minimum_Path(grid,0,i,dp);
            ans=Math.min(a,ans);
        }
        return ans;
    }
    public static int Minimum_Path(int [][] grid, int cr, int cc,int[][]dp){
        if(cc==grid[0].length || cc<0){
            return Integer.MAX_VALUE;
        }
        if(cr==grid.length-1){
            return grid[cr][cc];
        }
        if(dp[cr][cc]!=-1000000){
            return dp[cr][cc];
        }
        int d=Minimum_Path(grid,cr+1,cc,dp);
        int r=Minimum_Path(grid,cr+1,cc+1,dp);
        int l=Minimum_Path(grid,cr+1,cc-1,dp);
        return dp[cr][cc]=Math.min(d,Math.min(r,l))+grid[cr][cc];
    }
}