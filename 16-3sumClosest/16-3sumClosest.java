// Last updated: 8/2/2025, 4:05:30 PM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if(Math.abs(target-ans)>Math.abs(nums[i]+nums[j]+nums[k]-target)){
                    ans=nums[i]+nums[j]+nums[k];
                }
                if(nums[i]+nums[j]+nums[k]>target){
                    k--;
                }
                else{
                    j++;
                }
            }

        }
        return ans;
    }
}