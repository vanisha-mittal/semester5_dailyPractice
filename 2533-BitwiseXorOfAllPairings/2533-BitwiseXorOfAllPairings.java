// Last updated: 7/31/2025, 5:15:16 PM
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1=0;
        int xor2=0;
        if(nums1.length%2!=0){
            for(int num:nums2){
                xor2^=num;
            }
        }
        if(nums2.length%2!=0){
            for(int num:nums1){
                xor1^=num;
            }
        }
        return xor1^xor2;
    }
}