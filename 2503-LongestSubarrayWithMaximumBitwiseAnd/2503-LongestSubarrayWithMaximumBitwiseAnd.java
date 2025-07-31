// Last updated: 7/31/2025, 5:15:25 PM
class Solution {
    public int longestSubarray(int[] nums) {
        int max_len=1;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            max=Math.max(max,i);
        }
        int l=0;
        for(int i:nums){
            if(i==max){
                l++;
            }
            else{
                max_len=Math.max(l,max_len);
                l=0;
            }
        }
        max_len=Math.max(l,max_len);
        return max_len;
    }
}