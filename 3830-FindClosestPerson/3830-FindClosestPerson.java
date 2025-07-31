// Last updated: 7/31/2025, 5:09:17 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        if(Math.abs(x-z)<Math.abs(y-z)){
            return 1;
        }
        else if(Math.abs(x-z)==Math.abs(y-z)){
            return 0;
        }
        else{
            return 2;
        }
    }
}