// Last updated: 9/26/2025, 11:21:27 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i:nums){
            if(m.containsKey(i)){
                return true;
            }
            else{
                m.put(i,1);
            }
        }
        return false;
    }
}