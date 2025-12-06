// Last updated: 12/6/2025, 5:22:49 PM
1class Solution {
2    public int countPartitions(int[] nums, int k) {
3        final int MOD = 1_000_000_007;
4        int n = nums.length;
5
6        long[] dp = new long[n + 1];
7        long[] prefix = new long[n + 2];
8        dp[0] = 1;
9        prefix[1] = 1;
10
11        Deque<Integer> minQ = new ArrayDeque<>();
12        Deque<Integer> maxQ = new ArrayDeque<>();
13        int l = 0;
14
15        for (int i = 0; i < n; i++) {
16            while (!maxQ.isEmpty() && nums[maxQ.peekLast()] <= nums[i]) {
17                maxQ.pollLast();
18            }
19            while (!minQ.isEmpty() && nums[minQ.peekLast()] >= nums[i]) {
20                minQ.pollLast();
21            }
22
23            maxQ.addLast(i);
24            minQ.addLast(i);
25
26            while (nums[maxQ.peekFirst()] - nums[minQ.peekFirst()] > k) {
27                if (maxQ.peekFirst() == l) {
28                    maxQ.pollFirst();
29                }
30                if (minQ.peekFirst() == l) {
31                    minQ.pollFirst();
32                }
33                l++;
34            }
35
36            dp[i + 1] = (prefix[i + 1] - prefix[l] + MOD) % MOD;
37            prefix[i + 2] = (prefix[i + 1] + dp[i + 1]) % MOD;
38        }
39        return (int) dp[n];
40    }
41}