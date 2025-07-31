// Last updated: 7/31/2025, 5:11:56 PM
class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int c=0;
        for (int i=0;i<hours.length;i++){
            for (int j=i+1;j<hours.length;j++){
                if ((hours[i]+hours[j])%24==0){
                    c++;
                }
            }
        }
        return c;
    }
}