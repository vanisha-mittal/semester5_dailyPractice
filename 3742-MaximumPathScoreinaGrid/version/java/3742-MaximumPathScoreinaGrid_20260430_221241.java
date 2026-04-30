// Last updated: 4/30/2026, 10:12:41 PM
1class Solution {
2    public int maxPathScore(int[][] grid, int k) {
3        int m = grid.length, n = grid[0].length;
4        int[][] dummy= grid;  
5        int[][][] dp = new int[m][n][k + 1];
6        for (int[][] row : dp)
7            for (int[] col : row)
8                Arrays.fill(col, -1);
9        int si = dummy[0][0];
10        int score = (si == 1) ? 1 : (si == 2) ? 2 : 0;
11        int cost = (si == 1 || si == 2) ? 1 : 0;
12
13        if (cost <= k)
14            dp[0][0][cost] = score;
15
16        for (int i = 0; i < m; i++) {
17            for (int j = 0; j < n; j++) {
18                int val = dummy[i][j];
19                int sc = (val == 1) ? 1 : (val == 2) ? 2 : 0;
20                int cs = (val == 1 || val == 2) ? 1 : 0;
21
22                for (int c = cs; c <= k; c++) {
23                    int prev = -1;
24
25                    if (i > 0 && dp[i - 1][j][c - cs] != -1)
26                        prev = Math.max(prev, dp[i - 1][j][c - cs]);
27                    if (j > 0 && dp[i][j - 1][c - cs] != -1)
28                        prev = Math.max(prev, dp[i][j - 1][c - cs]);
29
30                    if (prev != -1) {
31                        dp[i][j][c] = Math.max(dp[i][j][c], prev + sc);
32                    }
33                }
34            }
35        }
36        int ans = -1;
37        for (int c = 0; c <= k; c++) {
38            ans = Math.max(ans, dp[m - 1][n - 1][c]);
39        }
40
41        return ans;
42    }
43}