// Last updated: 9/10/2025, 12:38:17 PM
class Solution {
    public int findNumbers(int[] nums) {
        int evenCounter = 0;
        for(int num: nums){
            if(((int)Math.log10(num))%2 == 1)
                evenCounter++;
        }
        return evenCounter;
    }
}