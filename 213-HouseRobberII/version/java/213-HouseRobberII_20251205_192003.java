// Last updated: 12/5/2025, 7:20:03 PM
1class Solution {
2    public int rob(int[] nums) {
3        int n=nums.length;
4        if(n==0) return 0;
5        if(n==1) return nums[0];
6
7        int case1=robbing(nums,0,n-2);
8        int case2=robbing(nums,1,n-1);
9
10        return Math.max(case1,case2);
11    }
12
13    private int robbing(int[] nums,int start,int end){
14        int prev2=0,prev1=0;
15        for(int i=start;i<=end;i++){
16            int rob=nums[i]+prev2;
17            int curr=Math.max(rob,prev1);
18
19            prev2=prev1;
20            prev1=curr;
21        }
22        return prev1;
23    }
24}