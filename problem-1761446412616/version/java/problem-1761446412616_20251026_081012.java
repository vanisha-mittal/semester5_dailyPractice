// Last updated: 10/26/2025, 8:10:12 AM
class Solution {
    public long removeZeros(long n) {
        String s=String.valueOf(n);
        return Long.parseLong(s.replace("0",""));
    }
}