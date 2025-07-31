// Last updated: 7/31/2025, 5:20:31 PM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
                int val=st.pop();
                ans[val]=i-val;
            }
            st.push(i);
            
        }
        return ans;
    }
}