// Last updated: 2/9/2026, 3:21:31 PM
1class Solution {
2    public int[] cycleLengthQueries(int n, int[][] queries) {
3        int[] ans = new int[queries.length];
4        int x = 0;
5        for (int i = 0; i < queries.length; i++) {
6            int a = queries[i][0];
7            int b = queries[i][1];
8            int ah = 0;
9            int bh = 0;
10            while (a != b) {
11                if (a > b) {
12                    a /= 2;
13                    ah++;
14                } else {
15                    b /= 2;
16                    bh++;
17                }
18            }
19            ans[x++] = bh + ah + 1;
20        }
21        return ans;
22    }
23}