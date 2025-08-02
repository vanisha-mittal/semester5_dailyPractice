// Last updated: 8/2/2025, 4:04:12 PM
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ll=new ArrayList<>();
		sub(nums,new ArrayList<>(),ll,0);
        return ll;
	}
	public static void sub(int[] ques, List<Integer> ans,List<List<Integer>> ll,int i) {
		 if(i==ques.length) {
			 ll.add(new ArrayList<>(ans));
			 return;
		 }
		 int ch=ques[i];
		 sub(ques,ans,ll,i+1);
         ans.add(ch);
		 sub(ques,ans,ll,i+1); 
         ans.remove(ans.size()-1);
	}
}
