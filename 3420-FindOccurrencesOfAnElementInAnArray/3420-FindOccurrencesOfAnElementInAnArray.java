// Last updated: 7/31/2025, 5:12:05 PM
class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int counter = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == x){
                map.put(counter, i);
                counter++;
            }            
        }
        for(int  i = 0; i < queries.length; i++){
            if(!map.containsKey(queries[i])) queries[i] = -1;
            else queries[i] = map.get(queries[i]);
        }
        return queries;
    }
}