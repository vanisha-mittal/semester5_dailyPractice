// Last updated: 8/2/2025, 4:04:02 PM
class Solution {
    public int largestRectangleArea(int[] heights) {
        return Largest_Rectangle(heights);
    }
    public static int Largest_Rectangle(int[] arr) {
		Stack<Integer> st=new Stack<>();
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty() && arr[i]<arr[st.peek()]) {
				int h=arr[st.pop()];
				int r=i;
				if(st.isEmpty()) {
					ans=Math.max(ans, h*r);
				}
				else {
					int l=st.peek();
					int area=h*(r-l-1);
					ans=Math.max(area, ans);
				}
			}
			st.push(i);
		}
		while(!st.isEmpty()) {
			int h=arr[st.pop()];
			int r=arr.length;
			if(st.isEmpty()) {
				ans=Math.max(ans, h*r);
			}
			else {
				int l=st.peek();
				int area=h*(r-l-1);
				ans=Math.max(area, ans);
			}
		}
		return ans;
	}

}