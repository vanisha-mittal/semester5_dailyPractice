// Last updated: 3/17/2026, 3:36:45 PM
1class Solution {
2    public int myAtoi(String s) {
3        boolean start=false;
4        int sign=1;
5        long ans=0;
6        int min=Integer.MIN_VALUE;
7        int max=Integer.MAX_VALUE;
8        for(int i=0;i<s.length();i++){
9            char ch=s.charAt(i);
10            if(!start && ch==' ') continue;
11            else if(!start && (ch=='-' || ch=='+')){
12                sign=ch=='-'?-1:1;
13                start=true;
14            } 
15            else if(ch<'0' || ch>'9'){
16                break;
17            }
18            else {
19                start=true;
20                ans=ans*10+(ch-'0');
21                if (sign * ans <= min) {
22                return min;
23                }
24                if (sign * ans >= max) {
25                    return max;
26                }
27            }
28            
29        }
30        return (int)ans*sign;
31    }
32}