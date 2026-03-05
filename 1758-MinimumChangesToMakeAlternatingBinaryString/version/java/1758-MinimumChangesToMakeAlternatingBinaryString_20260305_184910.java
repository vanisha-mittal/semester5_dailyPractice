// Last updated: 3/5/2026, 6:49:10 PM
1class Solution {
2    public int minOperations(String s) {
3        int n = s.length(), c = 0, j = 0;
4        for(char ch : s.toCharArray()) {
5            if(ch - '0' == j) c++;
6            j ^= 1;
7        }
8        return Math.min(c, n - c);
9    }
10}