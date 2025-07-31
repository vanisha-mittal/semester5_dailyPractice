// Last updated: 7/31/2025, 5:10:45 PM
class Solution {
    public String getEncryptedString(String s, int k) {
        int n = s.length();
        k%=n;
        s=s+s;
        return s.substring(k, k+n);
    }
}