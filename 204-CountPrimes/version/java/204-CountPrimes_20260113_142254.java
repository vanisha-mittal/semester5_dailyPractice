// Last updated: 1/13/2026, 2:22:54 PM
1class Solution {
2    public int countPrimes(int n) {
3        if(n<2){
4            return 0;
5        }
6        return PrimeSieve(n);
7    }
8    public static int PrimeSieve(int n) {
9		boolean[] ans=new boolean[n];
10		ans[0]=ans[1]=true;
11		for(int i=2;i<Math.sqrt(n);i++) {
12			if(ans[i]==false) {
13				for(int j=2;i*j<n;j++) {
14					ans[i*j]=true;
15				}
16			}
17		}
18		int c=0;
19		for(int i=0;i<n;i++) {
20			if(ans[i]==false)c++;
21		}
22		return c;
23	}
24}