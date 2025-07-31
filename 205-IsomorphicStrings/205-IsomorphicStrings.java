// Last updated: 7/31/2025, 5:21:58 PM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> mp=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(mp.containsKey(s.charAt(i))){
                if(t.charAt(i)!=mp.get(s.charAt(i))){
                    return false;
                }
            }
            else if(mp.containsValue(t.charAt(i))){
                return false;
            }
            else{
                mp.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}