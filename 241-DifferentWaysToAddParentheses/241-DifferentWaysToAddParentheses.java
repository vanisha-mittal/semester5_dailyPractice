// Last updated: 7/31/2025, 5:21:37 PM
class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        return solve(expression);
    }
    public static List<Integer> solve(String s){
        List<Integer> ans = new ArrayList<>();
        if(s.length()==0){
            return ans;
        }
        if(s.length()==1){
            ans.add(Integer.parseInt(s));
            return ans;
        }
        if(s.length()==2 && Character.isDigit(s.charAt(0)) && Character.isDigit(s.charAt(1))){
            ans.add(Integer.parseInt(s));
            return ans;
        }
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            continue;
            List<Integer> left=solve(s.substring(0, i));
            List<Integer> right=solve(s.substring(i+1));
            for(int l:left){
                for(int r:right){
                    if(ch=='+')
                    ans.add(l+r) ;
                    else if(ch=='-')
                    ans.add(l-r);
                    else
                    ans.add(l*r);
                }
            }
        }
        return ans;
    }
}