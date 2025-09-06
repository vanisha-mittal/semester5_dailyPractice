// Last updated: 9/6/2025, 10:42:04 PM
class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i:nums){
            if(digits(i)%2==0){
                c++;
            }
        }
        return c;
    }
    public int digits(int i){
        int d=0;
        while(i>0){
            d++;
            i/=10;
        }
        return d;
    }
}