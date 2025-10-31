// Last updated: 10/31/2025, 2:23:34 PM
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st =new Stack<>();
        for(int a:asteroids){
            if(a>0) st.push(a);
            else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<-a){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()==-a){
                    st.pop();
                    continue;
                }
                else if(st.isEmpty()||st.peek()<0){
                    st.push(a);
                }
            }
        }
        int idx=0;
        int[] ans=new int[st.size()];
        for(int i:st){
            ans[idx++]=i;
        }
        return ans;
    }
}