// Last updated: 12/18/2025, 9:52:07 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int[] l=new int[2];
4        for(int i=0;i<nums.length;i++){
5            for(int j=i+1;j<nums.length;j++){
6                if(nums[i]+nums[j]==target){
7                    l[0]=i;
8                    l[1]=j;
9                    break;
10                }
11            }
12        }
13        return l;
14    }
15}