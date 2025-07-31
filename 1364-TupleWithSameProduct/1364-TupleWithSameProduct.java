// Last updated: 7/31/2025, 5:19:03 PM
class Solution {
    public int tupleSameProduct(int[] nums) {
        int c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if (map.containsKey(nums[i]*nums[j])) {
                    map.put(nums[i]*nums[j], map.get(nums[i]*nums[j]) + 1);
                } else {
                    map.put(nums[i]*nums[j], 1);
                }
            }
       } 
       for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int n=entry.getValue();
            c+= 8*n * (n - 1) / 2;
        }
        return c;
    }
    
}