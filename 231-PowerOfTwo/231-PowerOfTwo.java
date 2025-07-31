// Last updated: 7/31/2025, 5:21:47 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        if((n & (n-1))==0){
            return true;
        }
        return false;
    }
}