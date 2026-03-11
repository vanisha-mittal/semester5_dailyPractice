// Last updated: 3/11/2026, 3:30:15 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3        int i=0;
4        int j=s.length()-1;
5        while(i<j){
6            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
7                i++;
8            }
9            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
10                j--;
11            }
12
13            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))) return false;
14            i++;
15            j--;
16        }
17        return true;
18
19    }
20}