// Last updated: 12/26/2025, 9:29:54 PM
1class Solution {
2    private long makePalin(long left, boolean odd) {
3        long ans = left;
4        if (odd)
5            left = left >> 1;
6        while (left > 0) {
7            ans = (ans << 1) | (left & 1);
8            left = left >> 1;
9        }
10        return ans;
11    }
12
13    public int countBinaryPalindromes(long n) {
14        if (n == 0)
15            return 1;
16        int len = 64 - Long.numberOfLeadingZeros(n);
17        long count = 1;
18        for (int i = 1; i < len; i++) {
19            int half = (i + 1) / 2;
20            count += 1L << (half - 1);
21        }
22        int half = (len + 1) / 2;
23        long prefix = n >> (len - half);
24        long palin = makePalin(prefix, len % 2 == 1);
25        count += (prefix - (1L << (half - 1)));
26        if (palin <= n)
27            ++count;
28        return (int)count;
29    }
30}