// Last updated: 7/31/2025, 5:19:14 PM
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int c=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=0){
                c++;
            }
            else{
                if(c>=3){
                    return true;
                }
                c=0;
            }
        }
        if(c>=3){
            return true;
        }
        return false;
        
    }
}