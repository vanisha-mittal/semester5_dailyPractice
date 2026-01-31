// Last updated: 1/31/2026, 8:52:07 PM
1class Solution {
2    public int minimumK(int[] nums) {
3        int n = nums.length;
4
5        int left = 1;
6        int right = Math.max(n, getMax(nums));
7
8        int ans = right;
9
10        while (left <= right) {
11            int k = left + (right - left) / 2;
12
13            long ops = 0;
14            for (int x : nums) {
15                ops += (x + k - 1) / k; 
16            }
17
18            if (ops <= (long) k * k) {
19                ans = k;
20                right = k - 1;
21            } else {
22                left = k + 1;
23            }
24        }
25        return ans;
26    }
27
28    private int getMax(int[] nums) {
29        int mx = 0;
30        for (int x : nums) mx = Math.max(mx, x);
31        return mx;
32    }
33}
34