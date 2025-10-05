// Last updated: 10/5/2025, 9:04:54 AM
class Solution {
    public int longestSubsequence(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int xor=0;
        for(int i:nums){
            xor^=i;
        }
        if(xor!=0) return nums.length;
        for (int num : nums) {
            if (num != 0) return nums.length - 1;
        }
        return 0; 
    }
}