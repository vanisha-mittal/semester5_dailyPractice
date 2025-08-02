// Last updated: 8/2/2025, 4:05:05 PM
class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] a=new int[2]; 
        int lo=0;
        int hi=arr.length-1;
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target){
                ans=mid;
                hi=mid-1;
            }
            else if(arr[mid]<target){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        a[0]=ans;
        lo=0;
        hi=arr.length-1;
        ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target){
                ans=mid;
                lo=lo+1;
            }
            else if(arr[mid]<target){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }

        a[1]=ans;
        return a;
    }
    
}