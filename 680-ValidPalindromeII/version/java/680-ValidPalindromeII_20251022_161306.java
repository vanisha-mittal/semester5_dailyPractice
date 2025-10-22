// Last updated: 10/22/2025, 4:13:06 PM
class Solution {
    public boolean validPalindrome(String s) {
        int si=0;
        int ei=s.length()-1;
        while(si<ei){
        if(s.charAt(si)==s.charAt(ei)){
            si++;ei--;
        }
        else{
            
            return (palindrome( s,si+1,ei)) || (palindrome( s, si, ei-1));
        }
        }
        return true;
    }
    private boolean palindrome(String s,int si,int ei){
        while(si<ei){
            if(s.charAt(si)!=s.charAt(ei)){
                return false;
            }
            si++;
            ei--;
            
        }
        return true;
    }
}