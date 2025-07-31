// Last updated: 7/31/2025, 5:21:30 PM
class Solution {
    public int hIndex(int[] citations) {
        int lo=0;
        int hi=citations.length-1;
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(citations[mid]>=citations.length-mid){
                ans=citations.length-mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
        
    }
}