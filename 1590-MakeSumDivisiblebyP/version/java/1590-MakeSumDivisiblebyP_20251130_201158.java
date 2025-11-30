// Last updated: 11/30/2025, 8:11:58 PM
1class Solution {
2    public int minSubarray(int[] nums, int p) {
3        int n = nums.length;
4        int res_len = n;
5
6        Map<Integer, Integer> map = new HashMap<>();
7        map.put(0, -1);
8
9        long total_sum = 0; 
10        for (int num : nums) {
11            total_sum += num;
12        }
13
14        int total_remainder = (int) (total_sum % p);
15        if (total_remainder == 0) return 0;
16
17        long prefix_sum = 0;
18        for (int i = 0; i < n; i++) {
19            prefix_sum += nums[i];
20            int curr_remainder = (int) (prefix_sum % p);
21
22            int target_remainder = (curr_remainder - total_remainder + p) % p;
23            if (map.containsKey(target_remainder)) {
24                int len = i - map.get(target_remainder);
25                res_len = Math.min(res_len, len);
26            }  
27
28            map.put(curr_remainder, i);
29        }
30
31        return (res_len == n) ? -1 : res_len;
32    }
33}