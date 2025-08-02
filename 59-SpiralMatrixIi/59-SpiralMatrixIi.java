// Last updated: 8/2/2025, 4:04:32 PM
class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][] = new int[n][n];
        int val = 1;
        int layer = (n+1) / 2;
        for(int i = 0; i < layer; i++){
            for(int j = i; j < n-i; j++){
                arr[i][j] = val++;
            }

            for(int j = i+1; j < n-i; j++){
                arr[j][n-i-1] = val++;
            }

            for(int j = n-i-2; j >= i; j--){
                arr[n-i-1][j] = val++;
            }

            for(int j = n-2-i; j > i; j--){
                arr[j][i] = val++;
            } 

        }
        return arr;
    }
}