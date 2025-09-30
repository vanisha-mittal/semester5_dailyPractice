// Last updated: 9/30/2025, 10:55:53 AM
class Solution {
    public int balancedString(String s) {
        int n=s.length();
        int x=n/4;
        int[] freq=new int[128];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)]++;
        }
        if(freq['Q']==x && freq['W']==x && freq['E']==x){
            return 0;
        }

        int si=0;
        int ans=n;
        for(int ei=0;ei<n;ei++){
            freq[s.charAt(ei)]--;
            while(si<n && freq['Q']<=x && freq['W']<=x && freq['E']<=x && freq['R']<=x){
                ans=Math.min(ans,ei-si+1);
                freq[s.charAt(si)]++;
                si++;
            }
        }
        return ans;
    }
}