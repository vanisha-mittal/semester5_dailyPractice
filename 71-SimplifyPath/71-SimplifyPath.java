// Last updated: 8/2/2025, 4:04:18 PM
class Solution {
    public String simplifyPath(String path) {
        String[] a=path.split("/");
        Stack<String> st=new Stack<>();
        for(String s:a){
            if(s.equals("") || s.equals(".")){
                continue;
            }
            if(s.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(s);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0,"/"+st.pop());
        }
        return sb.length()==0?"/":sb.toString();
    
    }
}