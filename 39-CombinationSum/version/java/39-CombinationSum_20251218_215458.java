// Last updated: 12/18/2025, 9:54:58 PM
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> ans= new ArrayList<>();
4        Print(target,new ArrayList<>(),candidates,0,ans);
5        return ans;
6    }
7    public static void Print(int amount,List<Integer> res,int[] coin,int idx,List<List<Integer>> ans) {
8		if(amount==0) {
9			ans.add(new ArrayList<>(res));
10			return; 
11		}
12		for(int i=idx;i<coin.length;i++) {
13			if(amount>=coin[i]) {
14                res.add(coin[i]);
15				Print(amount-coin[i],res,coin,i,ans);
16                res.remove(res.size()-1);
17			}
18		}
19	}
20}