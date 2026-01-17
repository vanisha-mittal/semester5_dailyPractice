// Last updated: 1/17/2026, 8:25:38 PM
1class Solution {
2    public int alternatingXOR(int[] nums, int target1, int target2) {
3        int n = nums.length;
4
5        int[] prefix = new int[n + 1];
6        for (int i = 0; i < n; i++) {
7            prefix[i + 1] = prefix[i] ^ nums[i];
8        }
9
10        long[][] dp = new long[n + 1][2];
11        dp[0][0] = 1;
12
13        Map<Integer, Long> map0 = new HashMap<>(); 
14        Map<Integer, Long> map1 = new HashMap<>();
15
16        map0.put(0, 1L);
17
18        for (int i = 1; i <= n; i++) {
19            int xor1 = prefix[i] ^ target1;
20            int xor2 = prefix[i] ^ target2;
21
22            dp[i][1] = map0.getOrDefault(xor1, 0L);
23            dp[i][0] = map1.getOrDefault(xor2, 0L);
24
25            dp[i][0] %= 1000000007;
26            dp[i][1] %= 1000000007;
27
28            map0.put(prefix[i], (map0.getOrDefault(prefix[i], 0L) + dp[i][0]) % 1000000007);
29            map1.put(prefix[i], (map1.getOrDefault(prefix[i], 0L) + dp[i][1]) % 1000000007);
30        }
31
32        return (int) ((dp[n][0] + dp[n][1]) % 1000000007);
33    }
34}