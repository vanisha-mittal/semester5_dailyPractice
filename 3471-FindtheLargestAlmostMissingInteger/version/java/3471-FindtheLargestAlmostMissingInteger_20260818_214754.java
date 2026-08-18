// Last updated: 8/18/2026, 9:47:54 PM
1class Solution {
2    public int largestInteger(int[] nums, int k) {
3        int n = nums.length;
4
5        HashMap<Integer, Integer> mp = new HashMap<>();
6
7        for (int i = 0; i < n; i++) {
8            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
9        }
10
11        if (k == nums.length) {
12            int maxValue = Integer.MIN_VALUE;
13
14            for (int i = 0; i < n; i++) {
15                maxValue = Math.max(maxValue, nums[i]);
16            }
17
18            return maxValue;
19        }
20
21        if (k == 1) {
22            int maxValue = -1;
23
24            for (int i = 0; i < n; i++) {
25                if (mp.get(nums[i]) == 1 && nums[i] > maxValue) {
26                    maxValue = nums[i];
27                }
28            }
29
30            return maxValue;
31        }
32
33        n = n - 1;
34
35        if (nums[0] == nums[n]) {
36            return -1;
37        }
38
39        if (mp.get(nums[0]) == 1 && mp.get(nums[n]) == 1) {
40            return Math.max(nums[0], nums[n]);
41        }
42
43        if (mp.get(nums[0]) == 1 && mp.get(nums[n]) > 1) {
44            return nums[0];
45        }
46
47        if (mp.get(nums[n]) == 1 && mp.get(nums[0]) > 1) {
48            return nums[n];
49        }
50
51        return -1;
52    }
53}