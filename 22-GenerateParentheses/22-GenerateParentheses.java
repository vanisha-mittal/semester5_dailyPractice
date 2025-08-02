// Last updated: 8/2/2025, 4:05:23 PM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ll= new ArrayList<>();
		Parentheses(n,0,0,"",ll);
        return ll;
    }
    public static void Parentheses(int n, int closed, int open, String ans,List<String> ll) {
		if(open == n && closed==n) {
			ll.add(ans);
			return;
		}
        if(open<n){
            Parentheses(n,closed,open+1,ans+"(",ll);
        }
		if(closed<open){
            Parentheses(n,closed+1,open,ans+")",ll);
        } 
		
	}
}