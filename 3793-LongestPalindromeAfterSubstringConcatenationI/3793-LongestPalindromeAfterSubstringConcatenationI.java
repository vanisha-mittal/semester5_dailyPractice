// Last updated: 7/31/2025, 5:09:28 PM
class Solution {
    public int longestPalindrome(String s, String t) {
        int ans=1;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<=s.length();j++){
                String S=s.substring(i,j);
                for(int k=0;k<t.length();k++){
                    for(int l=k;l<=t.length();l++){
                        String T=t.substring(k,l);
                        String p=S+T;
                        if(isPalindrome(p)){
                            ans=Math.max(ans,p.length());
                        }
                    }
                }
            }
        }
        return ans;
    }
    public boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}