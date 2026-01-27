// Last updated: 1/27/2026, 1:43:07 PM
1class Solution {
2    public int solve(int[][] q, int i, int target, int k, int[][] dp){
3    if(target == 0) return k;                                            
4    if(k >= q.length || target < 0) return q.length + 1;    
5    if(dp[target][k] != -1) return dp[target][k];
6    int res = solve(q, i, target, k+1, dp);       
7    if(q[k][0] <= i && i <= q[k][1]) res = Math.min(res, solve(q, i, target - q[k][2], k+1, dp));  
8    return dp[target][k] = res;
9}
10
11public int minZeroArray(int[] nums, int[][] queries) {
12    int ans = -1;
13    for(int i = 0; i < nums.length; ++i){
14        int[][] dp = new int[nums[i]+1][queries.length];
15        Arrays.stream(dp).forEach(row -> Arrays.fill(row, -1));
16        ans = Math.max(ans, solve(queries, i, nums[i], 0, dp));
17    }
18    return (ans > queries.length)?-1: ans;
19}
20}