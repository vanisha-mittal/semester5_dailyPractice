// Last updated: 9/29/2025, 1:14:40 PM
class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int n = arr.length;
        int lo = 1;
        int hi = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            hi = Math.max(hi,arr[i]);
        }
        int ans = hi;
        while(lo<=hi){
            int mid = lo +(hi-lo)/2;
            if(isPossible(mid,arr,h)){
                ans = mid;
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        return ans;
    }
     public boolean isPossible(int mid, int[] arr, int h){
        long hours = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            hours += (arr[i] + mid - 1) / mid;
            if(hours>h) return false; 
        }
        return true;
    }
}