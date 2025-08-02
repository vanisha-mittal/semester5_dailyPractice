// Last updated: 8/2/2025, 4:05:11 PM
class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int f=0;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                for(int j=n-1;j>i;j--){
                    if(nums[j]>nums[i]){
                        int temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                        Reverse(nums,i+1,n-1);
                        f=1;
                        break;
                    }
                }
                if(f==1){
                    break;
                }
            }
        }
        if(f==0){
            Reverse(nums,0,n-1);
        }
        
    }
    public static void Reverse(int[] arr,int i,int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
}