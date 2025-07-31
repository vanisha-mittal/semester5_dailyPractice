// Last updated: 7/31/2025, 5:19:37 PM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        return Binary(arr);
    }
    public static int Binary(int[] arr){
        int lo=0;
        int hi=arr.length-1;
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>arr[mid+1] ){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
}