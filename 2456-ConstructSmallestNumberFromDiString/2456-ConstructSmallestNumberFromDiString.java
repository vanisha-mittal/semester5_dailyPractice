// Last updated: 7/31/2025, 5:15:49 PM
class Solution {
    public String smallestNumber(String pattern) {
        return Smallest(pattern);
    }
    public static String Smallest(String s) {
		int count=1;
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[s.length()+1];
        for(int i=0;i<=s.length();i++){
            if(i==s.length() || s.charAt(i)=='I'){
                ans[i]=count;
                count++;
                while(!st.isEmpty()){
                    ans[st.pop()]=count;
                    count++;
                }
            }
            else{
                st.push(i);
            }
        }
        String str="";
        for(int v:ans) {
        	str+=v;
        }
        return str;
	}
}