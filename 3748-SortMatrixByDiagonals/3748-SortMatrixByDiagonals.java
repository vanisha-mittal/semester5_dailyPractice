// Last updated: 7/31/2025, 5:09:33 PM
class Solution {
    public int[][] sortMatrix(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            sort(grid,i,0,0);
            
        }
        for(int i=1;i<grid.length;i++){
            sort(grid,grid.length-1,i,0);
        }
        for(int i=1;i<grid.length;i++){
            sort(grid,0,i,1);
        }
        for(int i=1;i<grid.length;i++){
            sort(grid,i,grid.length-1,1);
        }
        return grid;
    }
    public static void sort(int[][] grid,int r,int c,int asc){
        List<Integer>ll = new ArrayList<>();
        int i=r;
        int j=c;
        while(i<grid.length && j<grid.length){
            ll.add(grid[i][j]);
            i++;
            j++;
        }
        if(asc==1){
            Collections.sort(ll);
            
        }
        else{
            Collections.sort(ll,Collections.reverseOrder());
        }
        i=r;
        j=c;
        int idx=0;
        while(i<grid.length && j<grid.length){
            grid[i][j]=ll.get(idx++);
            i++;
            j++;
        }
    }
}