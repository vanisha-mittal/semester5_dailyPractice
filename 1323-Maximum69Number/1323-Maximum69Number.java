// Last updated: 8/16/2025, 9:08:52 PM
class Solution {
    public int maximum69Number (int num) {
        String str = Integer.toString(num);
        int f=0;
        String s="";
        for(int i=0;i<str.length();i++){
            if(f==0 && str.charAt(i)=='6'){
                s+='9';
                f=1;
            }
            else{
                s+=str.charAt(i);
            }
        }
        return Integer.parseInt(s);
    }
}