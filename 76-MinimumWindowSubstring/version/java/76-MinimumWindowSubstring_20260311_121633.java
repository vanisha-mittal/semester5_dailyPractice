// Last updated: 3/11/2026, 12:16:33 PM
1class Solution {
2    public String minWindow(String s, String t) {
3        if (s==null || t==null || s.length()<t.length()) {
4            return "";
5        }
6        // store frequency of chars in t
7        int[] need=new int[128];
8        for (int i=0; i<t.length(); i++) {
9            char c=t.charAt(i);
10            need[c]++;
11        }
12        int left=0, right=0;
13        int count=t.length();     // how many chars still needed
14        int minLen=Integer.MAX_VALUE;
15        int start=0;
16        while (right < s.length()) {
17            char r = s.charAt(right);
18            if (need[r] > 0) {
19                count--;
20            }
21            need[r]--;
22            right++;
23
24            // try shrinking from left if valid
25            while(count==0) {
26                if(right-left < minLen) {
27                    minLen = right-left;
28                    start=left;
29                }
30                char l=s.charAt(left);
31                need[l]++;
32                if (need[l] > 0) {
33                    count++;
34                }
35                left++;
36            }
37        }
38        if (minLen==Integer.MAX_VALUE) {
39            return "";
40        } else {
41            return s.substring(start, start + minLen);
42        }
43    }
44}