// Last updated: 3/11/2026, 11:32:23 AM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        return Product(nums);
4    }
5    public static int[] Product(int[] arr) {
6		int n=arr.length;
7		int[] left=new int[n];
8		left[0]=1;
9		for(int i=1;i<n;i++) {
10			left[i]=left[i-1]*arr[i-1];
11		}
12		int [] right=new int[n];
13		right[n-1]=1;
14		for(int i=n-2;i>=0;i--) {
15			right[i]=right[i+1]*arr[i+1];
16		}
17		int[] ans=new int[n];
18		for(int i=0;i<n;i++) {
19			ans[i]=right[i]*left[i];
20		}
21		return ans;
22	}
23}