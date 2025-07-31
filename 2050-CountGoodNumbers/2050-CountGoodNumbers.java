// Last updated: 7/31/2025, 5:17:21 PM
class Solution {
    static final long MOD= 1_000_000_007;
    public int countGoodNumbers(long n) {
        long e = (n + 1) / 2;
        long o = n / 2;

        long even = Pow(5, e);
        long prime = Pow(4, o);

        return (int)((even * prime) % MOD);
    }
    public long Pow(long a,long b){
        long ans=1;
        a%=MOD;
        while(b>0){
            if(b%2==1){
                ans=(ans*a)% MOD;
            }
            a=(a*a)%MOD;
            b/=2;
        }
        return ans;
    }
}