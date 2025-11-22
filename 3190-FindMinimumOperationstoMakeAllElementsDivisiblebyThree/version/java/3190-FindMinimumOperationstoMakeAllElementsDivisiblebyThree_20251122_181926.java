// Last updated: 11/22/2025, 6:19:26 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        for(int i:nums){
            if(i%3!=0) c++;
        }
        return c;
    }
}