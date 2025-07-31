// Last updated: 7/31/2025, 5:22:10 PM
class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        Reverse(nums,0,nums.length-1);
        Reverse(nums,0,k-1);
        Reverse(nums,k,nums.length-1);
    }
    public void Reverse(int[] arr,int i,int j) {
        while(i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}