// Last updated: 1/16/2026, 10:49:28 PM
1class Solution {
2    public int minElements(int[] nums, int limit, int goal) {
3        long sum = 0;
4        for (int i = 0; i < nums.length; i++) {
5            sum += nums[i];
6        }
7
8        long a = Math.abs((long) goal - sum);
9        return (int) ((a + limit - 1) / limit);
10    }
11}