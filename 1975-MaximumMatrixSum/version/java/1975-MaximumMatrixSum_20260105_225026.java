// Last updated: 1/5/2026, 10:50:26 PM
1class Solution {
2    public long maxMatrixSum(int[][] matrix) {
3        long sum = 0;
4        int c = 0;
5        int mini = Integer.MAX_VALUE;
6        int n = matrix.length;
7        int m = matrix[0].length;
8        
9        for(int i = 0; i < n; i++) {
10            for(int j = 0; j < m; j++) {
11                sum += Math.abs(matrix[i][j]);
12                if(matrix[i][j] < 0) c++;
13                mini = Math.min(mini, Math.abs(matrix[i][j]));
14            }
15        }
16        
17        if(c % 2 == 1) sum -= 2 * mini;
18        
19        return sum;
20    }
21}