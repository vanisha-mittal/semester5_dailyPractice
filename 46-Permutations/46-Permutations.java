// Last updated: 8/2/2025, 4:04:50 PM
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        List<List<Integer>> ans2=new ArrayList<>();
        print(nums,ans,ans2);
        return ans2;
    }
    public static void print(int[] ques, List<Integer> ans, List<List<Integer>> ans2) {
        if (ques.length == 0) {
            ans2.add(new ArrayList<>(ans));
            return;
        }
        for (int i = 0; i < ques.length; i++) {
            int[] a = new int[ques.length - 1];
            int k = 0;
            for (int j = 0; j < ques.length; j++) {
                if (j != i) {
                    a[k++] = ques[j];
                }
            }
            ans.add(ques[i]);
            print(a, ans, ans2); 
            ans.remove(ans.size() - 1); 
        }
    }
}