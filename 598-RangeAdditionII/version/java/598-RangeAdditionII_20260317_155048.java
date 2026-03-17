// Last updated: 3/17/2026, 3:50:48 PM
1class Solution {
2    public int maxCount(int m, int n, int[][] ops) {
3        int min_row = m;
4        int min_col = n;
5        for (int i=0; i<ops.length; i++){
6            if (ops[i][0]<min_row) min_row=ops[i][0];
7            if (ops[i][1]<min_col) min_col=ops[i][1];
8        }        
9        return min_row*min_col;
10        
11    }
12}