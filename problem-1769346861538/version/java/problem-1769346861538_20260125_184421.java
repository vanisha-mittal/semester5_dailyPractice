// Last updated: 1/25/2026, 6:44:21 PM
1class Solution {
2    public long minimalKSum(int[] nums, int k) {
3        Arrays.sort(nums);
4        Set<Integer> set = new HashSet<>();
5        long sum = 0;
6
7        for (int num : nums) {
8            if (!set.contains(num) && num <= k) {
9                k++;
10                sum += num;
11            }
12            set.add(num);
13        }
14
15        long res = (long) (1 + k) * k / 2 - sum;
16        return res;
17
18    }
19}