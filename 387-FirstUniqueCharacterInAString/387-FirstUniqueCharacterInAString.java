// Last updated: 7/31/2025, 5:21:05 PM
class Solution {
    public int firstUniqChar(String s) {
        int[] f= new int[26];
        int ans=0;
        for(int i=0;i<s.length();i++){
            f[(int)s.charAt(i)-(int)'a']++;
            
        }
        for(int i=0;i<s.length();i++){
            if(f[(int)s.charAt(i)-(int)'a']==1){
                return i;
            }
        }
        return -1;
    }
}