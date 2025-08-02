// Last updated: 8/2/2025, 4:03:20 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int ans=1;
        int n = nums.length;
        if(n==0)return 0;
        for(int i=1;i<n;i++){
            int first = nums[i-1];
            int second = nums[i];
            if(first==second) continue;
            if(first+1==second){
                count++;
            }
            else{
                count=1;
            }
            if(count>ans){
                ans=count;
            }
        }
        return ans;
    }
}