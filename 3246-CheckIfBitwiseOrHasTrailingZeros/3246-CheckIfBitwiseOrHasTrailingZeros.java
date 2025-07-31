// Last updated: 7/31/2025, 5:12:44 PM
class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                c++;
            }
            if(c==2){
                return true;
            }
        }
        return false;
    }
}