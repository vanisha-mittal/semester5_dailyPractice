// Last updated: 10/6/2025, 10:41:10 AM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length()>s2.length()) return false;
        int[] count1=new int[26];
        int[] count2=new int[26];
        for(int i:s1.toCharArray()){
            count1[i-'a']++;
        }
        int window=s1.length();
        for(int i=0;i<s2.length();i++){
            count2[s2.charAt(i)-'a']++;
            if(i>=window){
                count2[s2.charAt(i-window)-'a']--;
            }
            if(Arrays.equals(count1,count2)) return true;
        }
        return false;
    }
}