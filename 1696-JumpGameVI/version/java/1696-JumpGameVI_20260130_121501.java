// Last updated: 1/30/2026, 12:15:01 PM
1class Solution {
2    public int maxResult(int[] nums, int k) {
3        Deque<Integer> dq = new ArrayDeque<>();
4        dq.add(0); 
5
6        for (int i = 1; i < nums.length; i++) {
7
8            while (!dq.isEmpty() && dq.peekFirst() < i - k) {
9                dq.pollFirst();
10            }
11
12            nums[i] += nums[dq.peekFirst()];
13
14            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
15                dq.pollLast();
16            }
17
18            dq.addLast(i);
19        }
20
21        return nums[nums.length - 1];
22    }
23}