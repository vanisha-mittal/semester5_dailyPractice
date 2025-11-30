// Last updated: 11/30/2025, 10:08:55 PM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int ans=0;
4        int c=0;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]==1) c++;
7            else{
8                ans=Math.max(ans,c);
9                c=0;
10            }
11        }
12        ans=Math.max(ans,c);
13        return ans;
14    }
15}