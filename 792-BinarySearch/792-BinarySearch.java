// Last updated: 7/31/2025, 5:19:51 PM
class Solution {
    public int search(int[] nums, int target) {
        return Binary(nums, target);
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
		return -1;
	}

}