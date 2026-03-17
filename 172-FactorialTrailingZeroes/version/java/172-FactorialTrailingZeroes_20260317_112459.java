// Last updated: 3/17/2026, 11:24:59 AM
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        int[]count =new int[1001];
        List<Integer> result = new ArrayList<>();
        
        for (int num:nums1){
            
            count[num]++;
            
            
        }
        
        for(int num :nums2){
            
            if(count[num]>0){
                result.add(num);
                count[num]--;
            }
        }
        
        int[]answer= new int[result.size()];
        for(int i =0;i<result.size();i++){
            answer[i]=result.get(i);
        }
        
        return answer;
    }
}