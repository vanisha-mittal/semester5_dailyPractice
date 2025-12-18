// Last updated: 12/18/2025, 9:55:37 PM
1class Solution {
2    public int[] searchRange(int[] arr, int target) {
3        int[] a=new int[2]; 
4        int lo=0;
5        int hi=arr.length-1;
6        int ans=-1;
7        while(lo<=hi){
8            int mid=lo+(hi-lo)/2;
9            if(arr[mid]==target){
10                ans=mid;
11                hi=mid-1;
12            }
13            else if(arr[mid]<target){
14                lo=mid+1;
15            }
16            else{
17                hi=mid-1;
18            }
19        }
20        a[0]=ans;
21        lo=0;
22        hi=arr.length-1;
23        ans=-1;
24        while(lo<=hi){
25            int mid=lo+(hi-lo)/2;
26            if(arr[mid]==target){
27                ans=mid;
28                lo=lo+1;
29            }
30            else if(arr[mid]<target){
31                lo=mid+1;
32            }
33            else{
34                hi=mid-1;
35            }
36        }
37
38        a[1]=ans;
39        return a;
40    }
41    
42}