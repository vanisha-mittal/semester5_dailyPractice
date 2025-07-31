// Last updated: 7/31/2025, 5:19:22 PM
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       return Count_SubArray(nums,k);
    }
    public static int Count_SubArray(int[] arr,int k) {
		int n=arr.length;
		long[] freq=new long[k];
		long sum=0;
		freq[0]=1;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			int rem=(int)(sum%k);
			if(rem<0) {
				rem+=k;
			}
			freq[rem]++;
		}
		long ans=0;
		for(int i=0;i<k;i++) {
			if(freq[i]>=2) {
				long x=freq[i];
				ans+=(x*(x-1))/2;
			}
		}
		return (int)ans;
	}
}