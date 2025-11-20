// Last updated: 11/20/2025, 2:41:54 PM
class Solution {
    public int minimumArea(int[][] grid) {
        int mini=grid.length;
        int maxi=-1;
        int minj=grid[0].length;
        int maxj=-1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    mini=Math.min(i,mini);
                    maxi=Math.max(i,maxi);
                    maxj=Math.max(j,maxj);
                    minj=Math.min(j,minj);

                }
            }
        }

        return (maxi-mini+1)*(maxj-minj+1);
    }
}