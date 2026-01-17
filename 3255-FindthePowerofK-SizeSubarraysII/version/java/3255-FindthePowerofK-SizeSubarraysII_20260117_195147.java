// Last updated: 1/17/2026, 7:51:47 PM
1class Solution {
2    public int[] resultsArray(int[] nums, int k) {
3        int n = nums.length;
4        int[] ans = new int[n - k + 1];
5        Arrays.fill(ans, -1);
6        if (k == 1) return nums;
7
8        int c = 0;
9        for (int i = 0; i < k - 1; i++) {
10            if (nums[i + 1] == nums[i] + 1)
11                c++;
12        }
13        if (c == k - 1)
14            ans[0] = nums[k - 1];
15        for (int i = 1; i + k <= n; i++) {
16
17            if (nums[i] == nums[i - 1] + 1)
18                c--;
19            if (nums[i + k - 1] == nums[i + k - 2] + 1)
20                c++;
21
22            if (c == k - 1)
23                ans[i] = nums[i + k - 1];
24        }
25
26        return ans;
27    }
28}