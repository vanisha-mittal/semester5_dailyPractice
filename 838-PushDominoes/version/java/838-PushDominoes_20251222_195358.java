// Last updated: 12/22/2025, 7:53:58 PM
1class Solution {
2    public String pushDominoes(String s) {
3        s = "L" + s + "R";
4        StringBuilder res = new StringBuilder();
5        int prev = 0;
6        for (int curr = 1; curr < s.length(); ++curr) {
7            if (s.charAt(curr) == '.') continue;
8            int span = curr - prev - 1;
9            if (prev > 0)
10                res.append(s.charAt(prev));
11            if (s.charAt(prev) == s.charAt(curr)) {
12                for (int i = 0; i < span; ++i)
13                    res.append(s.charAt(prev));
14            } else if (s.charAt(prev) == 'L' && s.charAt(curr) == 'R') {
15                for (int i = 0; i < span; ++i)
16                    res.append('.');
17            } else {
18                for (int i = 0; i < span / 2; ++i)
19                    res.append('R');
20                if (span % 2 == 1)
21                    res.append('.');
22                for (int i = 0; i < span / 2; ++i)
23                    res.append('L');
24            }
25            prev = curr;
26        }
27        return res.toString();
28    }
29}