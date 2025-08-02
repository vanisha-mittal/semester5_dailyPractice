// Last updated: 8/2/2025, 4:03:07 PM
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String i:tokens){
            if(i.equals("/")){
                int a=st.pop();
                st.push(st.pop()/a);
            }
            else if(i.equals("+")){
                int a=st.pop();
                st.push(st.pop()+a);
            }
            else if(i.equals("-")){
                int a=st.pop();
                st.push(st.pop()-a);
            }
            else if(i.equals("*")){
                int a=st.pop();
                st.push(st.pop()*a);
            }
            else{
                st.push(Integer.parseInt(i));
            }
        }
        return st.pop();
    }
}