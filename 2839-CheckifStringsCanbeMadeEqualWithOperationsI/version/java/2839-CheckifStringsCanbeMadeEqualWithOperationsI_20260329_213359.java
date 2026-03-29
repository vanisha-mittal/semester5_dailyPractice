// Last updated: 3/29/2026, 9:33:59 PM
1class Solution {
2    public boolean canBeEqual(String s1, String s2) {
3        char[] even1 = {s1.charAt(0), s1.charAt(2)}, even2 = {s2.charAt(0), s2.charAt(2)};
4        char[] odd1 = {s1.charAt(1), s1.charAt(3)}, odd2 = {s2.charAt(1), s2.charAt(3)};
5
6        Arrays.sort(even1); 
7        Arrays.sort(even2);
8        Arrays.sort(odd1); 
9        Arrays.sort(odd2);
10
11        return Arrays.equals(even1, even2) && Arrays.equals(odd1, odd2);
12    }
13}