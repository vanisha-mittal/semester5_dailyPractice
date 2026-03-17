// Last updated: 3/17/2026, 10:38:12 AM
1class Solution {
2    public String minWindow(String s, String t) {
3        if (s==null || t==null || s.length()<t.length()) {
4            return "";
5        }
6        int[] freq=new int[128];
7        for (int i=0; i<t.length(); i++) {
8            freq[t.charAt(i)]++;
9        }
10
11        int left=0, right=0;
12        int count=t.length();     
13        int minLen=Integer.MAX_VALUE;
14        int start=0;
15        
16        while (right < s.length()) {
17            char r = s.charAt(right);
18            if (freq[r] > 0) {
19                count--;
20            }
21            freq[r]--;
22            right++;
23
24            while(count==0) {
25                if(right-left < minLen) {
26                    minLen = right-left;
27                    start=left;
28                }
29                char l=s.charAt(left);
30                freq[l]++;
31                if (freq[l] > 0) {
32                    count++;
33                }
34                left++;
35            }
36        }
37        if (minLen==Integer.MAX_VALUE) {
38            return "";
39        } else {
40            return s.substring(start, start + minLen);
41        }
42    }
43}