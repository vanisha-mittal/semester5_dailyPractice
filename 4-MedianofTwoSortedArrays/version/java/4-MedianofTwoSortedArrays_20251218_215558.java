// Last updated: 12/18/2025, 9:55:58 PM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int a=0;
4    int b=0;
5    int sum=nums1.length+nums2.length;
6    int k=sum/2;
7    int[]arr=new int[k+1];
8    int c=0;
9    while(a<nums1.length && b<nums2.length && c<=k){
10        if(nums1[a]<nums2[b])
11        arr[c++]=nums1[a++];
12        else
13        arr[c++]=nums2[b++];
14    }
15    while(a<nums1.length && c<=k)
16    arr[c++]=nums1[a++];
17    while(b<nums2.length && c<=k)
18    arr[c++]=nums2[b++];
19    if(sum%2!=0){
20        return (arr[k]*1.000000);
21    }
22    else
23    return ((arr[k]+arr[k-1])/2.0);
24        
25    }
26}