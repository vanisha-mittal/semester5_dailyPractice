// Last updated: 1/19/2026, 3:07:35 PM
1class Solution {
2    public boolean checkValidString(String s) {
3        int min=0;
4        int max=0;
5        for(int i=0;i<s.length();i++){
6            if(s.charAt(i)=='('){
7                min++;
8                max++;
9            }
10            else if(s.charAt(i)==')'){
11                if(min>0) min--;
12                max--;
13            }
14            else{
15                if(min>0) min--;
16                max++;
17            }
18            if(max<0) return false;
19        }
20        return min==0;
21
22    }
23}