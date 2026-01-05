// Last updated: 1/5/2026, 12:23:08 PM
1class Solution {
2    public boolean isInterleave(String s1, String s2, String s3) {
3
4        if (s1.length() + s2.length() != s3.length()) return false;
5
6        Boolean[][] dp = new Boolean[s1.length() + 1][s2.length() + 1];
7
8        return interleave(s1, s2, s3, 0, 0, 0, dp);
9    }
10
11    public boolean interleave(String s1, String s2, String s3,
12                              int i, int j, int k, Boolean[][] dp) {
13
14        // reached end of s3
15        if (k == s3.length()) return true;
16
17        // memoization check
18        if (dp[i][j] != null) return dp[i][j];
19
20        boolean a = false, b = false;
21
22        if (i < s1.length() && s1.charAt(i) == s3.charAt(k)) {
23            a = interleave(s1, s2, s3, i + 1, j, k + 1, dp);
24        }
25
26        if (j < s2.length() && s2.charAt(j) == s3.charAt(k)) {
27            b = interleave(s1, s2, s3, i, j + 1, k + 1, dp);
28        }
29
30        return dp[i][j] = a || b;
31    }
32}