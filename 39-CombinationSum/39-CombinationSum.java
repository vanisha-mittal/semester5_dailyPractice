// Last updated: 8/2/2025, 4:04:59 PM
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        Print(target,new ArrayList<>(),candidates,0,ans);
        return ans;
    }
    public static void Print(int amount,List<Integer> res,int[] coin,int idx,List<List<Integer>> ans) {
		if(amount==0) {
			ans.add(new ArrayList<>(res));
			return; 
		}
		for(int i=idx;i<coin.length;i++) {
			if(amount>=coin[i]) {
                res.add(coin[i]);
				Print(amount-coin[i],res,coin,i,ans);
                res.remove(res.size()-1);
			}
		}
	}
}