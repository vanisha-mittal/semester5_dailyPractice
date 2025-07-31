// Last updated: 7/31/2025, 5:14:50 PM
class Solution {
    public int passThePillow(int n, int time) {
        time=time%(2*n-2);
        if(time<n){
            return 1+time;
        }
        return n-((1+time)%n);

    }
}