// Last updated: 9/26/2025, 11:25:57 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> m=new HashSet<>();
        for(int i:nums){
            if(m.contains(i)){
                return true;
            }
            else{
                m.add(i);
            }
        }
        return false;
    }
}