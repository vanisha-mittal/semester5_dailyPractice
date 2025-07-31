// Last updated: 7/31/2025, 5:21:16 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<1){
            return false;
        }
        while(n%4==0){
            n/=4;
        }
        if(n==1){
            return true;
        }
        return false;
    }
}