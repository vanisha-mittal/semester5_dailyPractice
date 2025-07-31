// Last updated: 7/31/2025, 5:17:25 PM
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        int[] f1=new int[26];
        int [] f2=new int[26];
        for(int i=0;i<s1.length();i++){
            f1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s1.length();i++){
            f2[s2.charAt(i)-'a']++;
        }
        if(!Arrays.equals(f1,f2)){
            return false;
        }
        int c=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                c++;
            }
        }
        if(c==0 || c==2){
            return true;
        }
        return false;
    }
}