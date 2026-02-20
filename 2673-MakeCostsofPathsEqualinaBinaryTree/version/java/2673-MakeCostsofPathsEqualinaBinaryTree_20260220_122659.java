// Last updated: 2/20/2026, 12:26:59 PM
1class Solution {
2    public int minIncrements(int n, int[] A) {
3        int res = 0;
4        for (int i = n / 2 - 1; i >= 0; --i) {
5            int l = i * 2 + 1, r = i * 2 + 2;
6            res += Math.abs(A[l] - A[r]);
7            A[i] += Math.max(A[l], A[r]);
8        }
9        return res;
10    }
11}