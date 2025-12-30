// Last updated: 12/30/2025, 10:02:08 PM
1class Solution {
2    public int findJudge(int n, int[][] trust) {
3        if (trust.length == 0 && n == 1) 
4            return 1;
5        int[] degree = new int[n + 1];
6        for (int[] a : trust) {
7            degree[a[0]]--;
8            degree[a[1]]++;
9        }
10
11        for (int i = 0; i < degree.length; i++) {
12            if (degree[i] == n - 1) return i;
13        }
14        return -1;
15    }
16}