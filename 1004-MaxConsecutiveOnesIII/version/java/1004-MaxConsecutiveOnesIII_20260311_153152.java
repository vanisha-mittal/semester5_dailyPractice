// Last updated: 3/11/2026, 3:31:52 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        Map<Character,Integer> mp=new HashMap<>();
4        for(char x:s.toCharArray()){
5            mp.put(x,mp.getOrDefault(x,0)+1);
6        }
7        for(char x:t.toCharArray()){
8            mp.put(x,mp.getOrDefault(x,0)-1);
9        }
10        for(int x:mp.values()){
11            if(x!=0){
12                return false;
13            }
14        }
15        return true;
16    }
17}