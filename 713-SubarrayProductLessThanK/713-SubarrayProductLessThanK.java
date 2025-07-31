// Last updated: 7/31/2025, 5:20:33 PM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return Product_less_than_k(nums,k);
    }
    public static int Product_less_than_k(int[] arr,int k) {
		int ans=0;
		int si=0,ei=0,p=1;
		while(ei<arr.length ) {
			p=p*arr[ei];
			while(p>=k && si<=ei) {
				p=p/arr[si];
				si++;
			}
			ans=ans+ei-si+1;
			ei++;
		}
		return ans;
	}
}  