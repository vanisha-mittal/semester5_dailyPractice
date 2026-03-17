// Last updated: 3/17/2026, 3:35:53 PM
1class Solution {
2    public int myAtoi(String s) {
3        boolean start=false;
4        int sign=1;
5        long ans=0;
6        int min=Integer.MIN_VALUE;
7        int max=Integer.MAX_VALUE;
8        for(int i=0;i<s.length();i++){
9            if(!start && s.charAt(i)==' ') continue;
10            else if(!start && (s.charAt(i)=='-' || s.charAt(i)=='+')){
11                sign=s.charAt(i)=='-'?-1:1;
12                start=true;
13            } 
14            else if(s.charAt(i)<'0' || s.charAt(i)>'9'){
15                break;
16            }
17            else {
18                start=true;
19                ans=ans*10+(s.charAt(i)-'0');
20                if (sign * ans <= min) {
21                return min;
22                }
23                if (sign * ans >= max) {
24                    return max;
25                }
26            }
27            
28        }
29        return (int)ans*sign;
30    }
31}