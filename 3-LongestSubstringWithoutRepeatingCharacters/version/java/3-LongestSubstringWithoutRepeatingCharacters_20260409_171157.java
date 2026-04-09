// Last updated: 4/9/2026, 5:11:57 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int i = 0;
4        int ans = 0;
5        HashSet<Character> hs = new HashSet<>();
6
7        for (int j = 0; j < s.length(); j++) {
8            while (hs.contains(s.charAt(j))) {
9                hs.remove(s.charAt(i));
10                i++;
11            }
12
13            hs.add(s.charAt(j));
14            ans = Math.max(ans, j - i + 1);
15        }
16
17        return ans;       
18    }
19}