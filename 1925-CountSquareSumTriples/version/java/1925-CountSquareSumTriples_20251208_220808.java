// Last updated: 12/8/2025, 10:08:08 PM
1class Solution {
2    public int countTriples(int n) {
3        int cnt = 0;
4        for (int a = 1; a < n; a++) {
5            for (int b = a + 1; b < n; b++) {
6                int sumSquares = a * a + b * b;
7                int c = (int) Math.sqrt(sumSquares);
8                
9                if (c * c == sumSquares && c <= n) {
10                    cnt += 2; 
11                }
12            }
13        }
14        return cnt;
15    }
16}
17