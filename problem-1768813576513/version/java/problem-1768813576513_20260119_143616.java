// Last updated: 1/19/2026, 2:36:16 PM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st = new Stack<>();
4
5        if (s.length() == 1) return false;
6
7        for (int i = 0; i < s.length(); i++) {
8            char ch = s.charAt(i);
9
10            if (ch == '(' || ch == '{' || ch == '[') {
11                st.push(ch);
12            } else {
13                if (st.isEmpty()) return false;
14
15                if (ch == ')' && st.peek() == '(') {
16                    st.pop();
17                } else if (ch == '}' && st.peek() == '{') {
18                    st.pop();
19                } else if (ch == ']' && st.peek() == '[') {
20                    st.pop();
21                } else {
22                    return false;
23                }
24            }
25        }
26
27        return st.isEmpty(); 
28    }
29}