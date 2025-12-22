// Last updated: 12/22/2025, 8:05:25 PM
1class Solution {
2    private static final int MOD = 1_000_000_007;
3    
4    public int numWays(String s) {
5        int n = s.length();
6        long totalOnes = 0;
7
8        for (char c : s.toCharArray()) {
9            if (c == '1') totalOnes++;
10        }
11
12        if (totalOnes % 3 != 0) return 0;
13
14        if (totalOnes == 0) {
15            long ways = (long) (n - 1) * (n - 2) / 2;
16            return (int) (ways % MOD);
17        }
18
19        long ones = totalOnes / 3;
20        long zero1 = 0, zero2 = 0;
21        long curr = 0;
22
23        for (int i = 0; i < n; i++) {
24            if (s.charAt(i) == '1') curr++;
25
26            if (curr == ones) {
27                if (i + 1 < n && s.charAt(i + 1) == '0') zero1++;
28            }
29            else if (curr == 2 * ones) {
30                if (i + 1 < n && s.charAt(i + 1) == '0') zero2++;
31            }
32        }
33
34        long result = (zero1 + 1) * (zero2 + 1) % MOD;
35        return (int) result;
36    }
37}