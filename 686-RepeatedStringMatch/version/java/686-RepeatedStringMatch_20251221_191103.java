// Last updated: 12/21/2025, 7:11:03 PM
1class Solution {
2    public int repeatedStringMatch(String a, String b) {
3        int s1 = a.length();
4        int s2 = b.length();
5        String temp = a;
6        int count = 1;
7
8        // Repeat a until b is found in it
9        while (!a.contains(b)) {
10            a += temp;
11            count++;
12
13            // Optimization: If a becomes too long and still doesn't contain b, return -1
14            if (a.length() > b.length() + 2 * temp.length()) {
15                return -1;
16            }
17        }
18
19        return count;
20    }
21}