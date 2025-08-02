// Last updated: 8/2/2025, 4:03:06 PM
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
		String[] arr=s.split("\s+");
		String ans="";
		for(int i=arr.length-1;i>0;i--) {
			ans=ans+arr[i]+" ";
		}
		return ans+arr[0];
    }
}