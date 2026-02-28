// Last updated: 2/28/2026, 8:18:13 PM
1class Solution {
2    static final long MOD = 1000000007;
3
4    long pow(long a, long b) {
5        long r = 1;
6        while (b > 0) {
7            if ((b & 1) == 1) r = (r * a) % MOD;
8            a = (a * a) % MOD;
9            b >>= 1;
10        }
11        return r;
12    }
13
14    public int sumOfNumbers(int l, int r, int k) {
15        long cnt = r - l + 1;
16        long S = (long)(l + r) * cnt / 2 % MOD;
17
18        long p1 = pow(cnt, k - 1);
19        long p2 = (pow(10, k) - 1 + MOD) % MOD;
20        long inv = pow(9, MOD - 2);
21        long P = p2 * inv % MOD;
22
23        long ans = S % MOD;
24        ans = ans * p1 % MOD;
25        ans = ans * P % MOD;
26
27        return (int) ans;
28        
29    }
30}