// Last updated: 7/31/2025, 5:21:22 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1){
            return false;
        }
        while(n%3==0){
            n/=3;
        }
        if(n==1){
            return true;
        }
        return false;
    }
}