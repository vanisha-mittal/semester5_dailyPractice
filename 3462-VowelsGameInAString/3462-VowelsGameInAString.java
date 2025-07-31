// Last updated: 7/31/2025, 5:11:00 PM
class Solution {
    public boolean doesAliceWin(String s) {
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            return true;
        }
        return false;
    }
}