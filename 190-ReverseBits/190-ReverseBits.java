// Last updated: 7/31/2025, 5:22:08 PM
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans=0;
        for(int i=0;i<32;i++){
            ans=(ans<<1)|(n&1);
            n=n>>>1;
        }
        return ans;
    }
}