// Last updated: 1/21/2026, 12:06:41 PM
class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        return xor(arr1) & xor(arr2);
    }
    public int xor(int[] arr){
        int x = 0;
        for(int num: arr){
            x ^= num;
        }
        return x;
    }
}