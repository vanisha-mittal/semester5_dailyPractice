// Last updated: 7/31/2025, 5:09:37 PM
class Solution {
    public String findValidPair(String s) {
        int[] f=new int[10];
        for(int i=0;i<s.length();i++){
            f[s.charAt(i)-'0']++;
        }
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)&& f[s.charAt(i)-'0']==s.charAt(i)-'0'&&f[s.charAt(i+1)-'0']==s.charAt(i+1)-'0'){
                return s.substring(i,i+2);
            }
        }
        return "";
    }
}