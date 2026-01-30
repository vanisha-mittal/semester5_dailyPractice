// Last updated: 1/30/2026, 12:38:34 PM
1class Solution {
2    public long perfectPairs(int[] nums) {
3        int n = nums.length;
4        long c = 0;
5        long ans = 0;
6
7         int[] arr = new int[n];
8        for (int i = 0; i < n; i++) {
9            arr[i] = Math.abs(nums[i]);
10        }
11        Arrays.sort(arr);
12        int j = 0;
13        for (int i = 0; i < n; i++) {
14            // move j until condition satisfied
15            while (arr[i] > 2L * arr[j]) {
16                j++;
17            }
18            ans += (i - j);
19        }
20
21        return ans;
22    }
23}