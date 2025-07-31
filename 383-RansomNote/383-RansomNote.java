// Last updated: 7/31/2025, 5:21:08 PM
class Solution {
    public boolean canConstruct(String r, String m) {
        if(r.length()>m.length()){
            return false;
        }
        int[] f=new int[26];
        for(int i=0;i<m.length();i++){
            f[m.charAt(i)-'a']++;
        }
        for(int i=0;i<r.length();i++){
            if(f[r.charAt(i)-'a']==0){
                return false;
            }
            f[r.charAt(i)-'a']--;
        }
        return true;

    }
}