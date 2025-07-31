// Last updated: 7/31/2025, 5:09:41 PM
class Solution {
    public boolean hasMatch(String s, String p) {
        if(p.equals("*")){
            return true;
        }
        String[] str=p.split("\\*");
        
        if(str.length==1){
            return s.contains(str[0]);
        }
        String f=str[0];
        String l=str[1];
        return s.contains(f)&& s.substring(s.indexOf(f)+f.length(),s.length()).contains(l);
    }
}