// Last updated: 7/31/2025, 5:20:56 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
       int[] n=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            n[nums[i]-1]=1;
        }
        for(int i=0;i<nums.length;i++){
            if(n[i]==0){
                ans.add(i+1);
            }
        }
        return ans;
    }
}