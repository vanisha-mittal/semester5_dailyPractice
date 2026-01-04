// Last updated: 1/4/2026, 2:24:08 PM
1class Solution {
2    public int findTargetSumWays(int[] nums, int target) {
3        return fun(nums,0,target,0);
4    }
5    public int fun(int[] nums, int i, int target, int curr){
6        if(i>=nums.length && curr==target) return 1;
7        if(i>=nums.length) return 0;
8
9        return fun(nums,i+1,target,curr+nums[i])+fun(nums,i+1,target,curr-nums[i]);
10    }
11}