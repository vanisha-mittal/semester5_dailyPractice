// Last updated: 8/2/2025, 4:05:04 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        return Binary(nums,target);
    }
    public static int Binary(int [] arr, int item) {
		int l=0;
		int h=arr.length-1;
		while(l<=h) {
			int mid=(l+h)/2;
			if(arr[mid]==item) {
				return mid;
			}
			else if(arr[mid]>item) {
				h=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		return l;
    }
}