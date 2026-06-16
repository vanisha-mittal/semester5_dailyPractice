// Last updated: 6/16/2026, 10:15:57 AM
1class Solution {
2    public int findTargetSumWays(int[] nums, int target) {
3        return sum(nums,0,target,0);
4    }
5    public int sum(int[] nums, int i, int target, int curr){
6        if(i>=nums.length && curr==target) return 1;
7        if(i>=nums.length) return 0;
8
9        return sum(nums,i+1,target,curr+nums[i])+sum(nums,i+1,target,curr-nums[i]);
10    }
11}