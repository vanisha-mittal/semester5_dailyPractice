// Last updated: 7/31/2025, 5:13:41 PM
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int x=0;
        for(int num:derived){
            x^=num;
        }
        return x==0;
    }
}