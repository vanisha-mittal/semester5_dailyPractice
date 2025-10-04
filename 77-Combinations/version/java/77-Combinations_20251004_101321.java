// Last updated: 10/4/2025, 10:13:21 AM
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        print(n,k,ans,1,ll);
        return ll;
    }
    public static void print(int n,int k,List<Integer> ans,int idx,List<List<Integer>> ll){
        if(ans.size()==k){
            ll.add(new ArrayList<>(ans));
            return;
        }
        for(int i=idx;i<=n;i++){
            ans.add(i);
            print(n,k,ans,i+1,ll);
            ans.remove(ans.size()-1);
        }
    }
}