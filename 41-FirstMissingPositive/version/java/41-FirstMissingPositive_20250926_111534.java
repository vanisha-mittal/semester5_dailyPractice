// Last updated: 9/26/2025, 11:15:34 AM
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        int i=1;
        while(true){
            if(!hs.contains(i)){
                return i;
            }
            i++;
        }
    }
}