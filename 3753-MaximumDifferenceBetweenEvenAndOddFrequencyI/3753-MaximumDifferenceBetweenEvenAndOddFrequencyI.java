// Last updated: 7/31/2025, 5:09:31 PM
class Solution {
    public int maxDifference(String s) {
        int[] f= new int[26];
        for(int i=0;i<s.length();i++){
            f[s.charAt(i)-'a']++;
        }
        Arrays.sort(f);
        int a=0;
        for(int i=25;i>=0;i--){
            if(f[i]%2==1){
                a=f[i];
                break;
            }
        }
        int b=0;
        for(int i=0;i<26;i++){
            if(f[i]%2==0 && f[i]!=0){
                b=f[i];
                break;
            }
        }
        return a-b;
    }
}