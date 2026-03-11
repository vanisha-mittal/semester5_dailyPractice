// Last updated: 3/11/2026, 10:26:54 AM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int ans=Integer.MIN_VALUE;
4		int sum=0;
5		for(int i=0;i<nums.length;i++) {
6			sum+=nums[i];
7			ans=Math.max(ans, sum);
8			if(sum<0) {
9				sum=0;
10			}
11		}
12		return ans;
13    }
14}