// Last updated: 8/9/2025, 7:12:39 PM
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