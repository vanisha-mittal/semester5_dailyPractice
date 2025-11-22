// Last updated: 11/22/2025, 8:09:14 PM
class Solution {
    public int minimumFlips(int n) {
        String s = Integer.toBinaryString(n);
        int l=0;
        int r=s.length()-1;
        int c=0;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                c+=2;
            }
            l++;
            r--;
        }
        return c;
    }
}