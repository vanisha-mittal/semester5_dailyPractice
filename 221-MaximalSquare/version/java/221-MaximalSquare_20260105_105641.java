// Last updated: 1/5/2026, 10:56:41 AM
1class Solution {
2    public int maximalSquare(char[][] matrix) {
3        int n = matrix.length;
4        int m = matrix[0].length;
5        int[][] dp = new int[n][m];
6        int ans = 0;
7
8        for (int i = 0; i < n; i++) {
9            for (int j = 0; j < m; j++) {
10                if (matrix[i][j] == '1') {
11                    if (i == 0 || j == 0) {
12                        dp[i][j] = 1;
13                    } else {
14                        dp[i][j] = Math.min(dp[i][j - 1],Math.min(dp[i - 1][j], dp[i - 1][j - 1])) + 1;
15                    }
16                    ans = Math.max(ans, dp[i][j]);
17                }
18            }
19        }
20
21        return ans * ans;
22    }
23}
24