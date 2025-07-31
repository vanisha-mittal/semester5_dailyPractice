// Last updated: 7/31/2025, 5:09:43 PM
class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min_s=Integer.MAX_VALUE;
        boolean f=false;
        for(int size=l;size<=r;size++){
            int c_sum=0;
            for(int i=0;i<size;i++){
                c_sum+=nums.get(i);
            }
            if(c_sum>0){
                min_s=Math.min(min_s,c_sum);
                f=true;
            }

            for (int i = size; i < nums.size(); i++) { 
                c_sum += nums.get(i) - nums.get(i - size);
                if (c_sum > 0) {
                    min_s = Math.min(min_s, c_sum); 
                    f = true; 
                } 
            }
        }
        if(f==true){
            return min_s;
        }
        return -1;
    }
}