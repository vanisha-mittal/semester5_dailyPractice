// Last updated: 2/28/2026, 8:09:19 PM
1class Solution {
2    public String mergeCharacters(String s, int k) {
3        StringBuilder sb = new StringBuilder(s);
4        
5        boolean flag = true;
6        
7        while (flag) {
8            flag = false;
9            
10            for (int i = 0; i < sb.length(); i++) {
11                for (int j = i + 1; j < sb.length(); j++) {
12                    
13                    if (sb.charAt(i) == sb.charAt(j) && j - i <= k) {
14                        sb.deleteCharAt(j);   
15                        flag = true;
16                        break;                
17                    }
18                }
19                if (flag) break;
20            }
21        }
22        
23        return sb.toString();
24    }
25}