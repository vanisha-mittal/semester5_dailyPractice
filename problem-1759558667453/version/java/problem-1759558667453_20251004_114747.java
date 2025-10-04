// Last updated: 10/4/2025, 11:47:47 AM
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int max=0;
        int n=score.length;
        for(int i=0;i<n;i++){
            max=Math.max(max,score[i]);
        }
        int[] idx=new int[max+1];
        Arrays.fill(idx,-1);
        for(int i=0;i<n;i++){
            idx[score[i]]=i;
        }
        String[] ans=new String[n];
        int place=1;
        for(int i=max;i>=0;i--){
            if(idx[i]==-1){
                continue;
            }
            if(place==1){
                ans[idx[i]]="Gold Medal";
            }
            else if(place==2){
                ans[idx[i]]="Silver Medal";
            }
            else if(place==3){
                ans[idx[i]]="Bronze Medal";
            }
            else{
                ans[idx[i]]=String.valueOf(place);
            }
            place++;
        }
        return ans;
    }
}