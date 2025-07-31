// Last updated: 7/31/2025, 5:20:46 PM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()){
            return false;
        }
        for(int i=0;i<=s2.length()-s1.length();i++){
            if(Arrays.equals(freq(s2.substring(i,i+s1.length())),freq(s1))){
                return true;
            }
        }
        return false;
    }
    public static int[] freq(String s){
        int[] ans=new int[26];
        for(int i=0;i<s.length();i++){
            ans[s.charAt(i)-'a']++;
        }
        return ans;
    }
}