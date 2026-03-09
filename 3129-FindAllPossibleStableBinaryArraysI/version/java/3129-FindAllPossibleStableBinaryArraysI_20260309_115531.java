// Last updated: 3/9/2026, 11:55:31 AM
1class Solution {
2    static final int MOD = 1000000007;
3
4    public int numberOfStableArrays(int zero, int one, int limit) {
5        int[][] dp0 = new int[zero + 1][one + 1];
6        int[][] dp1 = new int[zero + 1][one + 1];
7
8        for (int i = 1; i <= Math.min(zero, limit); i++) {
9            dp0[i][0] = 1;
10        }
11
12        for (int j = 1; j <= Math.min(one, limit); j++) {
13            dp1[0][j] = 1;
14        }
15
16        for (int i = 0; i <= zero; i++) {
17            for (int j = 0; j <= one; j++) {
18                if (i == 0 && j == 0) continue;
19
20                if (i > 0 && j > 0) {
21                    long ways0 = 0;
22                    for (int k = 1; k <= limit && i - k >= 0; k++) {
23                        ways0 = (ways0 + dp1[i - k][j]) % MOD;
24                    }
25                    dp0[i][j] = (int) ways0;
26
27                    long ways1 = 0;
28                    for (int k = 1; k <= limit && j - k >= 0; k++) {
29                        ways1 = (ways1 + dp0[i][j - k]) % MOD;
30                    }
31                    dp1[i][j] = (int) ways1;
32                }
33            }
34        }
35
36        return (dp0[zero][one] + dp1[zero][one]) % MOD;
37    }
38}