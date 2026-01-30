// Last updated: 1/30/2026, 12:42:47 PM
1class Solution {
2    public int lengthOfLIS(int[] arr) {
3        int[] dp=new int[arr.length];
4        int len=1;
5        dp[0]=arr[0];
6        for(int i=1;i<dp.length;i++){
7            if(arr[i]>dp[len-1]){
8                dp[len]=arr[i];
9                len++;
10            }
11            else{
12                int idx=BinarySearch(dp,0,len-1,arr[i]);
13                dp[idx]=arr[i];
14            }
15        }
16        return len;
17    }
18    public static int BinarySearch(int[] dp,int lo,int hi,int target){
19        int idx=0;
20        while(lo<=hi){
21            int mid=lo+(hi-lo)/2;
22            if(dp[mid]>=target){
23                idx=mid;
24                hi=mid-1;
25            }
26            else{
27                lo=mid+1;
28            }
29        }
30        return idx;
31    } 
32}