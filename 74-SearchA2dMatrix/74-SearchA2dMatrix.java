// Last updated: 8/2/2025, 4:04:16 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int a=0;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][matrix[0].length-1]==target){
                return true;
            }
            else if(matrix[i][matrix[0].length-1]>target){
                a=i;
                break;
            }
        }
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[a][j]==target){
                return true;
            }
        }
        return false;
    }
}