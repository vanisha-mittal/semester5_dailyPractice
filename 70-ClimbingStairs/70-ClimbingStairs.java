// Last updated: 8/2/2025, 4:04:20 PM
class Solution {
    public int climbStairs(int n) {
		return Print(n,new HashMap<>());
	}
	public static int Print(int n, HashMap<Integer,Integer> hm) {
        if(n==0 || n==1){
            return 1;
        }
        if(hm.containsKey(n)){
            return hm.get(n);
        }
		int a=Print(n-1,hm);
		int b=Print(n-2,hm);
        hm.put(n,a+b);
        return a+b;
	}
}