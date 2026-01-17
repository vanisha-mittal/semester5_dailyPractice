// Last updated: 1/17/2026, 8:16:17 PM
1class Solution {
2    public int minOperations(int[] nums, int[] target) {
3        HashSet<Integer> hs=new HashSet<>();
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]!=target[i]) hs.add(nums[i]);
6        }
7        return hs.size();
8    }
9}