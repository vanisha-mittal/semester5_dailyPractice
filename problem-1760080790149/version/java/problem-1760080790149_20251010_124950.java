// Last updated: 10/10/2025, 12:49:50 PM
class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int[] suffix=new int[energy.length];
        for(int i=energy.length-1;i>=energy.length-k;i--){
            suffix[i]=energy[i];
        }
        for(int i=energy.length-k-1;i>=0;i--){
            suffix[i]=suffix[i+k]+energy[i];
        }
        int ans=Integer.MIN_VALUE;
        for(int i:suffix){
            ans=Math.max(ans,i);
        }
        return ans;
    }
}