// Last updated: 8/2/2025, 4:05:51 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=0;
    int b=0;
    int sum=nums1.length+nums2.length;
    int k=sum/2;
    int[]arr=new int[k+1];
    int c=0;
    while(a<nums1.length && b<nums2.length && c<=k){
        if(nums1[a]<nums2[b])
        arr[c++]=nums1[a++];
        else
        arr[c++]=nums2[b++];
    }
    while(a<nums1.length && c<=k)
    arr[c++]=nums1[a++];
    while(b<nums2.length && c<=k)
    arr[c++]=nums2[b++];
    if(sum%2!=0){
        return (arr[k]*1.000000);
    }
    else
    return ((arr[k]+arr[k-1])/2.0);
        
    }
}