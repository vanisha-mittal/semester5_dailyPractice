// Last updated: 7/31/2025, 5:15:06 PM
class Solution {
    public int countAnagrams(String s) {
        String[] words=s.split(" ");
        int l=0;
        for(String i:words){
            l=Math.max(l,i.length());
        }
        long[] dp=new long[l+1];
        dp[0]=1;
        for(int i=1; i<=l; i++) {
            dp[i]=(i*dp[i-1])%1000000007;
        }
        long ans=1;
        for(String i:words){
            long count=dp[i.length()];
            int[] freq=new int[26];
            for(int x=0;x<i.length();x++) {
                freq[i.charAt(x)-'a']++;
            }
            for(int f:freq) {
                if(f>1){
                    count = (count * modInverse(dp[f], 1000000007)) % 1000000007;
                } 
            }
            ans= (ans*count % 1000000007);
        }
        return (int)ans;
    }
        private long modInverse(long a, int mod) {
        long res = 1;
        long base = a;
        int exp = mod - 2;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = (res * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return res;
    }
}