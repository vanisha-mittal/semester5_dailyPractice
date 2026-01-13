// Last updated: 1/13/2026, 2:08:10 PM
1class Solution {
2    public int strStr(String haystack, String needle) {
3        if (needle.length() == 0)
4            return 0;
5        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
6            if (haystack.substring(i, i + needle.length()).equals(needle)) {
7                return i;
8            }
9        }
10        return -1;
11    }
12}