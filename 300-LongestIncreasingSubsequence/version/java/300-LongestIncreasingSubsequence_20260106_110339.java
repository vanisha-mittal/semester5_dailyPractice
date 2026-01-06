// Last updated: 1/6/2026, 11:03:39 AM
1class Solution {
2    public List<Integer> largestDivisibleSubset(int[] arr) {
3        Arrays.sort(arr);
4
5        int n = arr.length;
6        int[] dp = new int[n];
7        int[] prev = new int[n];
8
9        Arrays.fill(dp, 1);
10        Arrays.fill(prev, -1);
11
12        for (int i = 0; i < n; i++) {
13            for (int j = i - 1; j >= 0; j--) {
14                if (arr[i] % arr[j] == 0) {
15                    if (dp[j] + 1 > dp[i]) {
16                        dp[i] = dp[j] + 1;
17                        prev[i] = j;
18                    }
19                }
20            }
21        }
22
23        int ans = dp[0];
24        int idx = 0;
25
26        for (int i = 1; i < n; i++) {
27            if (dp[i] > ans) {
28                ans = dp[i];
29                idx = i;
30            }
31        }
32
33        List<Integer> res = new ArrayList<>();
34
35        while (idx != -1) {
36            res.add(arr[idx]);
37            idx = prev[idx];
38        }
39
40        Collections.reverse(res);
41
42        return res;
43    }
44}
45