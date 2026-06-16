// Last updated: 6/16/2026, 10:14:35 AM
1class Solution {
2    public int minMovesToMakePalindrome(String s) {
3        int count = 0;
4        
5        while(s.length() > 2) {
6            char i = s.charAt(0);
7            int n = s.length();
8            char j = s.charAt(n - 1);
9            
10            if (i == j) {
11                s = s.substring(1, n - 1);
12            } else {
13                int id1 = s.lastIndexOf(i);
14                int id2 = s.indexOf(j);
15                
16                int steps1 = n - id1 - 1;
17                int steps2 = id2;
18                
19                StringBuilder sb = new StringBuilder();
20                
21                if (steps1 > steps2) {
22                    count += steps2;
23                    sb.append(s.substring(0, id2));
24                    sb.append(s.substring(id2 + 1, n - 1));
25                } else {
26                    count += steps1;
27                    sb.append(s.substring(1, id1));
28                    sb.append(s.substring(id1 + 1));
29                }
30                
31                s = sb.toString();
32            }
33        }
34        
35        return count;
36    }
37}