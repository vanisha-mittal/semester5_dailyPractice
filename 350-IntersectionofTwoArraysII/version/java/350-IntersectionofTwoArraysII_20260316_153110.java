// Last updated: 3/16/2026, 3:31:10 PM
1class Solution {
2    public int climbStairs(int n) {
3		return Print(n,new HashMap<>());
4	}
5	public static int Print(int n, HashMap<Integer,Integer> hm) {
6        if(n==0 || n==1){
7            return 1;
8        }
9        if(hm.containsKey(n)){
10            return hm.get(n);
11        }
12		int a=Print(n-1,hm);
13		int b=Print(n-2,hm);
14        hm.put(n,a+b);
15        return a+b;
16	}
17}