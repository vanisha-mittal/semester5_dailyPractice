// Last updated: 4/18/2026, 3:12:44 PM
1class Solution {
2    public int mirrorDistance(int n) {
3        int a = n;
4        int rev = 0;
5
6        while (n > 0) {
7            rev = rev * 10 + (n % 10);
8            n /= 10;
9        }
10
11        return Math.abs(a - rev);
12    }
13}