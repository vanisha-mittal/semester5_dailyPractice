// Last updated: 7/31/2025, 5:09:50 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        for(int i:nums){
            if(i<k){
                return -1;
            }
        }
        Set<Integer> ans=new HashSet<>();
        for(int i:nums){
            if(i>k){
                ans.add(i);
            }
        }
        return ans.size();
    }
}