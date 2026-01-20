// Last updated: 1/20/2026, 3:01:02 PM
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        //max elemnt of array dont have any next greater---> condition1
4        int n=nums.length;
5        int[] res=new int[n];
6        for(int i=0;i<nums.length;i++){
7            res[i]=-1;
8            for(int j=1;j<nums.length;j++){
9                if(nums[i]<nums[(i+j)%n]){
10                    res[i]=nums[(i+j)%n];
11                    break;
12                }
13            }
14        }
15        return res;
16    }
17}