// Last updated: 1/4/2026, 3:59:32 PM
1class Solution {
2    public int countSquares(int[][] matrix) {
3        for(int i=0;i<matrix.length;i++){
4            for(int j=0;j<matrix[0].length;j++){
5                if(i!=0 && j!=0 && matrix[i][j]==1){
6                    matrix[i][j]=Math.min(matrix[i][j-1],Math.min(matrix[i-1][j],matrix[i-1][j-1]))+1;
7                }
8            }
9        }
10
11        int ans=0;
12        for(int i=0;i<matrix.length;i++){
13            for(int j=0;j<matrix[0].length;j++){
14                ans+=matrix[i][j];
15            }
16        }
17        return ans;
18    }
19    
20}