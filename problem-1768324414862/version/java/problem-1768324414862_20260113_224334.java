// Last updated: 1/13/2026, 10:43:34 PM
1class Solution {
2    public int minSessions(int[] tasks, int sessionTime) {
3        int n = tasks.length;
4        int[] dp = new int[1<<n]; 
5        int[] w = new int[1<<n]; 
6        Arrays.fill(dp, 100);
7        Arrays.fill(w, 1000);
8        dp[0]=0;
9        for (int i = 1; i < 1<<n; i++){
10            for (int j = 0; j < n; j++){
11                if ((i & 1 << j) > 0){
12                    int extra = 0, wh = w[i^1<<j]+tasks[j];
13                    if (wh > sessionTime){ 
14                        extra = 1;
15                        wh=tasks[j];
16                    }
17                    dp[i] = Math.min(dp[i], dp[i^1<<j]+extra);
18                    if (dp[i^1<<j]+extra==dp[i]){ 
19                        w[i]=Math.min(wh, w[i]);
20                    }
21                }
22            }
23        }
24        return dp[(1<<n)-1];
25    }
26}