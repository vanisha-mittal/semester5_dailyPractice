// Last updated: 7/31/2025, 5:21:00 PM
class Solution {
    public int thirdMax(int[] nums) {
        long f_max=Long.MIN_VALUE;
        long s_max=Long.MIN_VALUE;
        long t_max=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>f_max ){
                t_max=s_max;
                s_max=f_max;
                f_max=nums[i];
            }
            else if(nums[i]>s_max && nums[i]<f_max){
                t_max=s_max;
                s_max=nums[i];
            }
            else if(nums[i]>t_max && nums[i]<s_max && nums[i]<f_max){
                t_max=nums[i];
            }
        }
        if(t_max==Long.MIN_VALUE){
            return (int)f_max;
        }
        return (int)t_max;
    }
}