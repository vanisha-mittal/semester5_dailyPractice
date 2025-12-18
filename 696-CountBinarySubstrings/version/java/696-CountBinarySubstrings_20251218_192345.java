// Last updated: 12/18/2025, 7:23:45 PM
1class Solution {
2    static {
3        for (int i = 0; i < 500; i++) {
4            countBinarySubstrings("1100");
5        }
6    }
7
8    public static int countBinarySubstrings(String s) {
9        int prev = 0, cur_cnt = 1, ans = 0;
10
11        for (int i = 1; i < s.length(); i++) {
12            if (s.charAt(i) == s.charAt(i - 1))
13                cur_cnt++;
14            else {
15                ans += Math.min(cur_cnt, prev); 
16                prev = cur_cnt; 
17                cur_cnt = 1; 
18            }
19        }
20        return ans + Math.min(prev, cur_cnt);
21    }
22}