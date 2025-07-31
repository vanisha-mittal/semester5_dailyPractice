// Last updated: 7/31/2025, 5:10:14 PM
class Solution {
    public String losingPlayer(int x, int y) {
        int turns;
        y = y/4;
        if(y < x){
            turns = y;
        }
        else{
            turns= x;
        }

        if(turns%2==0){
            return "Bob";
        }
        return "Alice";
    }
}