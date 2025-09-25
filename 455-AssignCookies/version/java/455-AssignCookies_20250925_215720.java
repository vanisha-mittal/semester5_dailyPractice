// Last updated: 9/25/2025, 9:57:20 PM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        int c=0;
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                i++;
                j++;
                c++;
            }
            else{
                j++;
            }

        }
        return c;
    }
}