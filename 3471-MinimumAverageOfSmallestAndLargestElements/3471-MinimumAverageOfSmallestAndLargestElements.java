// Last updated: 7/31/2025, 5:10:27 PM
class Solution {
    public double minimumAverage(int[] nums) {
        double[] averages=new double[nums.length/2];
        Arrays.sort(nums);
        for(int i=0;i<nums.length/2;i++){
            averages[i]=(nums[i]+nums[nums.length-i-1])/2.0;
        }
        Arrays.sort(averages);
        return averages[0];  
    }
}