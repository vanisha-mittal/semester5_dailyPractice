// Last updated: 9/25/2025, 10:16:28 PM
class Solution {
    public int[] constructRectangle(int area) {
        int W = (int) Math.sqrt(area);
        
        while (area % W != 0) {
            W--;
        }
        
        int L = area / W;
        
        return new int[]{L, W};
    }
}