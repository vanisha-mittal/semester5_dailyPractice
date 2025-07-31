// Last updated: 7/31/2025, 5:11:20 PM
class Solution {
    public int minimumLength(String s) {
        int[]freq= new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int ans=0;
        for(int i=0;i<26;i++){
            if(freq[i]==0){
                continue;
            }
            if(freq[i]%2==0){
                ans+=2;
            }
            else{
                ans++;
            }
        }
        return ans;
    }
}