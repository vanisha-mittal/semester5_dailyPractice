// Last updated: 7/31/2025, 5:10:09 PM
class Solution {
    public int minFlips(int[][] grid) {
        int c1=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length/2;j++){
                if(grid[i][0+j]!=grid[i][grid[0].length-1-j]){
                    c1++;
                }
            }
        }
        if(c1==0){
            return 0;
        }
        int c2=0;
        for(int i=0;i<grid[0].length;i++){
            for(int j=0;j<grid.length/2;j++){
                if(grid[j][i]!=grid[grid.length-1-j][i]){
                    c2++;
                }
            }
        }
        return Math.min(c1,c2);

    }
}