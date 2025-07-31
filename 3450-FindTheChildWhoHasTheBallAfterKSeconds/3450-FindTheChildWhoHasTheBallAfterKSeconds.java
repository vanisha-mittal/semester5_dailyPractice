// Last updated: 7/31/2025, 5:11:47 PM
class Solution {
    public int numberOfChild(int n, int k) {
        k=k%(2*n-2);
        if(k<n){
            return k;
        }
        return 2*n-2-k;
        
    }
}