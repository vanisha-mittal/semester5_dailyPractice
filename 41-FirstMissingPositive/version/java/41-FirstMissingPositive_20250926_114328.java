// Last updated: 9/26/2025, 11:43:28 AM
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        return isMissing(hs,1);
    }
    public static int isMissing(HashSet<Integer> hs, int i){
        if(!hs.contains(i)){
            return i;
        }
        return isMissing(hs,i+1);

    }
}