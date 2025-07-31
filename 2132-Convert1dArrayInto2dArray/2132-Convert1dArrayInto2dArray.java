// Last updated: 7/31/2025, 5:16:57 PM
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length!=m*n){
            return new int[0][0];
        }
        int a=0;
        int[][]arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=original[a];
                a++;
            }
        }
        return arr;
        
    }
}