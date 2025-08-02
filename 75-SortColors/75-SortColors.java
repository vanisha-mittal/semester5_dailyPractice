// Last updated: 8/2/2025, 4:04:14 PM
class Solution {
    public void sortColors(int[] nums) {
        Sort(nums);
    }
    public static void Sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int idx=min_from_ith_index(arr,i);
			int temp=arr[i];
			arr[i]=arr[idx];
			arr[idx]=temp;
		}
	}
	public static int min_from_ith_index(int[] arr,int i) {
		int mini=i;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<arr[mini]) {
				mini=j;
			}
		}
		return mini;
	}

}