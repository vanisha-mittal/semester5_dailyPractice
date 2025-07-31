// Last updated: 7/31/2025, 5:09:24 PM
class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        if(n<3){
            return n;
        }
        int ans=(int)(Math.log(n)/Math.log(2));
        return 1<<(ans+1);

    }
}