// Last updated: 1/20/2026, 3:15:43 PM
1class Solution {
2    public int longestValidParentheses(String s) {
3        Stack<Integer> st=new Stack<>();
4        st.push(-1);
5        int ans=0;
6        for(int i=0;i<s.length();i++){
7            if(s.charAt(i)=='('){
8                st.push(i);
9            }
10            else{
11                st.pop();
12                if(st.isEmpty()){
13                    st.push(i);
14                }
15                else{
16                    ans=Math.max(ans,i-st.peek());
17                }
18
19            }
20        }return ans;
21    }
22}