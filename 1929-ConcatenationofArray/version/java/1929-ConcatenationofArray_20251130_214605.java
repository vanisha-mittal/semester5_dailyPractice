// Last updated: 11/30/2025, 9:46:05 PM
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int[] ans=new int[2*n];
4        int i=0;
5        for(int j=0;j<n;j++){
6            ans[i++]=nums[j];
7            ans[i++]=nums[j+n];
8        }
9        return ans;
10    }
11}