// Last updated: 12/24/2025, 4:55:04 PM
1class Solution {
2    public String smallestString(String s) {
3        int n = s.length(), i = 0;
4        char[] chars = s.toCharArray();
5
6        int aCount = 0;
7        for (char c : chars) {
8            if (c == 'a') aCount++;
9        }
10        if (aCount == n) {
11            chars[n - 1] = 'z';
12            return new String(chars);
13        }
14        while (i < n && chars[i] == 'a') 
15            i++;
16        while (i < n && chars[i] != 'a') {
17            chars[i] -= 1;
18            i++;
19        }
20
21        return new String(chars);
22    }
23}