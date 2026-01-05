// Last updated: 1/5/2026, 3:13:28 PM
1class Solution {
2    public int findNumberOfLIS(int[] arr) {
3        int[] dp=new int[arr.length];
4        int[] freq=new int[arr.length];
5
6        Arrays.fill(dp,1);
7        Arrays.fill(freq,1);
8        int maxLen=1;
9
10        for (int i = 0; i < arr.length; i++) {
11            for (int j = 0; j < i; j++) {
12                if (arr[i] > arr[j]) {
13                    if (dp[j] + 1 > dp[i]) {
14                        dp[i] = dp[j] + 1;
15                        freq[i] = freq[j];
16                    } else if (dp[j] + 1 == dp[i]) {
17                        freq[i] += freq[j];
18                    }
19                }
20            }
21            maxLen = Math.max(maxLen, dp[i]);
22        }
23        int ans=0;
24        for(int i=0;i<dp.length;i++){
25            if(dp[i]==maxLen) ans+=freq[i];
26        }
27        return ans;
28    }
29}