// Last updated: 9/6/2025, 10:43:31 PM
class Solution {
    public int findNumbers(int[] nums) {
        int evenCounter = 0;
        for(int num: nums){
            // System.out.println(num +"--->" +(int)Math.log10(num));
            if(((int)Math.log10(num))%2 == 1)
                evenCounter++;
        }
        return evenCounter;
    }
}