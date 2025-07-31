// Last updated: 7/31/2025, 5:21:36 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> mp=new HashMap<>();
        for(char x:s.toCharArray()){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        for(char x:t.toCharArray()){
            mp.put(x,mp.getOrDefault(x,0)-1);
        }
        for(int x:mp.values()){
            if(x!=0){
                return false;
            }
        }
        return true;
    }
}