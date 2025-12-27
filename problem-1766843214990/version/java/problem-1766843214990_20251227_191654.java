// Last updated: 12/27/2025, 7:16:54 PM
1class Solution {
2    public String resultingString(String s) {
3        Stack<Character> st = new Stack<>();
4        for(int i=0;i<s.length();++i){
5            char ch = s.charAt(i);
6            int diff = 0;
7            if(st.size() > 0) diff= Math.abs(st.peek() - ch);
8            if(!st.isEmpty() &&(diff == 1 || diff == 25)){
9                st.pop();
10                continue;
11            }
12
13            st.push(ch);
14        }
15
16        StringBuilder sb = new StringBuilder();
17        while(!st.isEmpty()){
18            sb.append(st.pop());
19        }
20
21        return sb.reverse().toString();
22        
23    }
24}