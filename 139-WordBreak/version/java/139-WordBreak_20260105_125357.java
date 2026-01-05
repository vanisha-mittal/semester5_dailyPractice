// Last updated: 1/5/2026, 12:53:57 PM
1class Solution {
2    Boolean[] memo;
3    Set<String> set;
4    int maxLen;
5
6    public boolean wordBreak(String s, List<String> wordDict) {
7        set = new HashSet<>(wordDict);
8        memo = new Boolean[s.length()];
9        maxLen = 0;
10
11        for (String w : wordDict) {
12            maxLen = Math.max(maxLen, w.length());
13        }
14
15        return dfs(0, s);
16    }
17
18    private boolean dfs(int i, String s) {
19        if (i == s.length()) return true;
20        if (memo[i] != null) return memo[i];
21
22        for (int j = i + 1; j <= s.length(); j++) {
23            if (set.contains(s.substring(i, j)) && dfs(j, s)) {
24                return memo[i] = true;
25            }
26        }
27
28        return memo[i] = false;
29    }
30}
31