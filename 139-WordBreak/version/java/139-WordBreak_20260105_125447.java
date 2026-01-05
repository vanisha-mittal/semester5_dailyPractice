// Last updated: 1/5/2026, 12:54:47 PM
1class Solution {
2    Boolean[] dp;
3    Set<String> set;
4
5    public boolean wordBreak(String s, List<String> wordDict) {
6        set = new HashSet<>(wordDict);
7        dp = new Boolean[s.length()];
8        return dfs(0, s);
9    }
10
11    private boolean dfs(int i, String s) {
12        if (i == s.length()) return true;
13        if (dp[i] != null) return dp[i];
14
15        for (int j = i + 1; j <= s.length(); j++) {
16            if (set.contains(s.substring(i, j)) && dfs(j, s)) {
17                return dp[i] = true;
18            }
19        }
20
21        return dp[i] = false;
22    }
23}
24