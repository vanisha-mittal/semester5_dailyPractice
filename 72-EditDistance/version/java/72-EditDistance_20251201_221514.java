// Last updated: 12/1/2025, 10:15:14 PM
1class Solution {
2  public int minDistance(String word1, String word2) {
3    final int m = word1.length();
4    final int n = word2.length();
5    int[][] dp = new int[m + 1][n + 1];
6
7    for (int i = 1; i <= m; ++i)
8      dp[i][0] = i;
9
10    for (int j = 1; j <= n; ++j)
11      dp[0][j] = j;
12
13    for (int i = 1; i <= m; ++i)
14      for (int j = 1; j <= n; ++j)
15        if (word1.charAt(i - 1) == word2.charAt(j - 1))//same characters
16          dp[i][j] = dp[i - 1][j - 1];//no operation
17        else
18          dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;                      //replace               //delete        //insert
19
20    return dp[m][n];
21  }
22}