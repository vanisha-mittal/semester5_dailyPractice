// Last updated: 3/16/2026, 2:35:30 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap<Integer,Integer> hm=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            int t=target-nums[i];
6            if(hm.containsKey(t)){
7                return new int[]{hm.get(t),i};
8            }
9            else{
10                hm.put(nums[i],i);
11            }
12        }
13        return new int[]{};
14    }
15}