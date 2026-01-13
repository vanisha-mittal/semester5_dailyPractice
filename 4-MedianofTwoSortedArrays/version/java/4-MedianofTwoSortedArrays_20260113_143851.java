// Last updated: 1/13/2026, 2:38:51 PM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int a=0;
4        int b=0;
5        int size=nums1.length+nums2.length;
6        int k=size/2;
7
8        int[] arr=new int[k+1];
9        int c=0;
10        while(a<nums1.length && b<nums2.length && c<=k){
11            if(nums1[a]<nums2[b]) arr[c++]=nums1[a++];
12            else arr[c++]=nums2[b++];
13        }
14        while(a<nums1.length && c<=k) arr[c++]=nums1[a++];
15        while(b<nums2.length && c<=k) arr[c++]=nums2[b++];
16
17
18        if(size%2!=0) return arr[k]*1.000000;
19        else return (arr[k]+arr[k-1])/2.0;
20    }
21}