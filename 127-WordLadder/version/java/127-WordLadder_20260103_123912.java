// Last updated: 1/3/2026, 12:39:12 PM
1class Solution {
2    public List<List<Integer>> generate(int n) {
3        List<List<Integer>> res = new ArrayList<>();
4        int[][] dp = new int[n][n];
5
6        for (int[] d : dp) {
7            Arrays.fill(d, -1);
8        }
9
10        for (int i = 0; i < n; i++) {
11            ArrayList<Integer> curr = new ArrayList<>();
12            for (int j = 0; j <= i; j++) {   // ✅ FIX
13                curr.add(rec(i, j, dp));
14            }
15            res.add(curr);
16        }
17
18        return res;
19    }
20
21    public static int rec(int r, int c, int[][] dp) {
22
23        if (c == 0 || c == r) {
24            return 1;
25        }
26
27        if (dp[r][c] != -1) return dp[r][c];
28
29        return dp[r][c] = rec(r - 1, c, dp) + rec(r - 1, c - 1, dp);
30    }
31}