// Last updated: 12/7/2025, 3:54:38 PM
1class Solution {
2    public boolean isMatch(String s, String p) {
3        int i = 0, j = 0;
4        int starIdx = -1, match = 0;
5
6        while (i < s.length()) {
7            if (j < p.length() && (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))) {
8                i++;
9                j++;
10            }
11            else if (j < p.length() && p.charAt(j) == '*') {
12                starIdx = j;
13                match = i;
14                j++;
15            }
16            else if (starIdx != -1) {
17                j = starIdx + 1;
18                match++;
19                i = match;
20            }
21            else {
22                return false;
23            }
24        }
25        while (j < p.length() && p.charAt(j) == '*') {
26            j++;
27        }
28
29        return j == p.length();
30    }
31}