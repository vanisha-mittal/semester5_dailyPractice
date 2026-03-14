// Last updated: 3/14/2026, 11:07:49 AM
1class Solution {
2    public String getHappyString(int n, int k) {
3        int x = (int)Math.pow(2, n - 1);
4        if (k > 3 * x)
5            return "";
6
7        String[] s = { "bc", "ac", "ab" };
8        StringBuilder sb = new StringBuilder();
9
10        if (k <= x)
11            sb.append('a');
12        else if (k <= 2 * x) {
13            sb.append('b');
14            k -= x;
15        } else {
16            sb.append('c');
17            k -= 2 * x;
18        }
19
20        for (int i = 1; i < n; i++) {
21            x /= 2;
22            String ch = s[sb.charAt(sb.length() - 1) - 'a'];
23            if (k <= x)
24                sb.append(ch.charAt(0));
25            else {
26                sb.append(ch.charAt(1));
27                k -= x;
28            }
29        }
30        return sb.toString();
31    }
32}