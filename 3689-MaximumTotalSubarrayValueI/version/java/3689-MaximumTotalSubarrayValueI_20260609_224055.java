// Last updated: 6/9/2026, 10:40:55 PM
1class Solution {
2
3    public long maxTotalValue(int[] nums, int k) {
4        int m1 = Integer.MAX_VALUE;
5        int m2 = Integer.MIN_VALUE;
6        for (int x : nums) {
7            m1 = Math.min(m1, x);
8            m2 = Math.max(m2, x);
9        }
10        return (long) (m2 - m1) * k;
11    }
12}