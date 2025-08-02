// Last updated: 8/2/2025, 4:05:45 PM
class Solution {
    public String longestPalindrome(String s) {
        return count_palindromic( s);
    }
    public static String count_palindromic(String s) {
		String ans="";
		for(int axis=0;axis<s.length();axis++) {
			for(int orbit=0;axis-orbit>=0 && axis+orbit<s.length();orbit++) {
				if(s.charAt(axis-orbit)!=s.charAt(axis+orbit)) {
					break;
				}
				if(2*orbit+1>ans.length()){
                    ans=s.substring(axis-orbit,axis+orbit+1);
                }
			}
		}
		for(double axis=0.5;axis<s.length();axis++) {
			for(double orbit=0.5;axis-orbit>=0 && axis+orbit<s.length();orbit++) {
				if(s.charAt((int)(axis-orbit))!=s.charAt((int)(axis+orbit))) {
					break;
				}
				if(2*orbit+1>ans.length()){
                    ans=s.substring((int)(axis-orbit),(int)(axis+orbit+1));
                }
			}
		}
		return ans;
	}
}