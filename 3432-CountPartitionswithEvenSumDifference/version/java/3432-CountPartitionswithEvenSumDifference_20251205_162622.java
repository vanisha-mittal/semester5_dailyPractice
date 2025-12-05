// Last updated: 12/5/2025, 4:26:22 PM
1class Solution {
2    public int countPartitions(int[] nums) {
3        int[] left=new int[nums.length];
4        left[0]=nums[0];
5        for(int i=1;i<nums.length;i++){
6            left[i]=left[i-1]+nums[i];
7        }
8        int c=0;
9        int sum=left[nums.length-1];
10        for(int i=0;i<nums.length-1;i++){
11            if(Math.abs((sum-left[i])-left[i])%2==0){
12                c++;
13            }
14        }
15        return c;
16    }
17}