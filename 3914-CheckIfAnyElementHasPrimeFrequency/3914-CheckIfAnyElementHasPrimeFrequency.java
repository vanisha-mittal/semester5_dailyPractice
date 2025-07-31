// Last updated: 7/31/2025, 5:09:20 PM
class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i:nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        for(int i:freq.values()){
            if(i==2||i==3||i==5||i==7){
                return true;
            }
            if(i==1||i%2==0||i%3==0||i%5==0||i%7==0){
                continue;
            }
            return true;
        }
        return false;
    }
}