// Last updated: 8/27/2025, 12:37:48 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(!s.contains(nums[i]-1)){
                int c=0;
                int key=nums[i];
                while(s.contains(key)){
                    s.remove(key);
                    c++;
                    key++;
                }
                ans=Math.max(ans,c);
            }
            
        }
        return ans;
    }
}