// Last updated: 12/21/2025, 7:34:03 PM
1class Solution {
2    public boolean isLongPressedName(String name, String typed) {
3        int i = 0;
4        int n = name.length();
5        int m = typed.length();
6
7        for (int j = 0; j < m; ++j) {
8            if (i < n && name.charAt(i) == typed.charAt(j)) {
9                i++;
10            } else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) {
11                return false;
12            }
13        }
14
15        return i == n;
16    }
17}