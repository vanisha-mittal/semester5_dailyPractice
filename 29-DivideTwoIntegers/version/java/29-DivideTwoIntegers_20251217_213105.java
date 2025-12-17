// Last updated: 12/17/2025, 9:31:05 PM
1class Solution {
2    public int divide(int dividend, int divisor) {
3        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
4        if (dividend == Integer.MIN_VALUE && divisor == 1) return Integer.MIN_VALUE;
5
6        boolean negative = (dividend < 0) ^ (divisor < 0);
7
8        long absDividend = Math.abs((long) dividend);
9        long absDivisor = Math.abs((long) divisor);
10
11        int quotient = 0;
12
13        while (absDividend >= absDivisor) {
14            long tempDivisor = absDivisor, multiple = 1;
15            while (absDividend >= (tempDivisor << 1)) {
16                tempDivisor <<= 1;
17                multiple <<= 1;
18            }
19            absDividend -= tempDivisor;
20            quotient += multiple;
21        }
22
23        return negative ? -quotient : quotient;
24    }
25}