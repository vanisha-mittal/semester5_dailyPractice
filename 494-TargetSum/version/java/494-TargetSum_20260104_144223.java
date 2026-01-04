// Last updated: 1/4/2026, 2:42:23 PM
1class Solution {
2    Map<String, Integer> dp = new HashMap<>();
3
4    public int findTargetSumWays(int[] nums, int target) {
5        return fun(nums, 0, 0, target);
6    }
7
8    public int fun(int[] nums, int i, int curr, int target) {
9        if (i == nums.length) {
10            return curr == target ? 1 : 0;
11        }
12
13        String key = i + "," + curr;
14        if (dp.containsKey(key)) return dp.get(key);
15
16        int add = fun(nums, i + 1, curr + nums[i], target);
17        int sub = fun(nums, i + 1, curr - nums[i], target);
18
19        dp.put(key, add + sub);
20        return dp.get(key);
21    }
22}
23