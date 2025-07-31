// Last updated: 7/31/2025, 5:22:00 PM
class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        return PrimeSieve(n);
    }
    public static int PrimeSieve(int n) {
		boolean[] ans=new boolean[n];
		ans[0]=ans[1]=true;
		for(int i=2;i<Math.sqrt(n);i++) {
			if(ans[i]==false) {
				for(int j=2;i*j<n;j++) {
					ans[i*j]=true;
				}
			}
		}
		int c=0;
		for(int i=0;i<n;i++) {
			if(ans[i]==false)c++;
		}
		return c;
	}
}