// Last updated: 1/31/2026, 8:41:56 PM
1class Solution {
2    public String reverseByType(String s) {
3        StringBuilder letters = new StringBuilder();
4        StringBuilder specials = new StringBuilder();
5
6        for (char c : s.toCharArray()) {
7            if (c >= 'a' && c <= 'z') {
8                letters.append(c);
9            } else {
10                specials.append(c);
11            }
12        }
13
14        letters.reverse();
15        specials.reverse();
16
17        StringBuilder result = new StringBuilder();
18        int li = 0, si = 0;
19
20        for (char c : s.toCharArray()) {
21            if (c >= 'a' && c <= 'z') {
22                result.append(letters.charAt(li++));
23            } else {
24                result.append(specials.charAt(si++));
25            }
26        }
27
28        return result.toString();
29    }
30}
31