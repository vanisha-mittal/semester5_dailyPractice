// Last updated: 7/31/2025, 5:21:55 PM
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans= new ArrayList<>();
        // int[] candidates={1,2,3,4,5,6,7,8,9};
        Print(n,new ArrayList<>(),1,ans,k);
        return ans;
    }
    public static void Print(int amount,List<Integer> res,int idx,List<List<Integer>> ans,int k) {
		if(amount==0 && res.size()==k) {
			ans.add(new ArrayList<>( res));
			return; 
		}
		for(int i=idx;i<=9;i++) {
			if(amount>=i) {
                res.add(i);
				Print(amount-i,res,i+1,ans,k);
                res.remove(res.size()-1);
			}
		}
	}
} 