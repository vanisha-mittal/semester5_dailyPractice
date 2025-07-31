// Last updated: 7/31/2025, 5:20:57 PM
class Solution {
    public int arrangeCoins(int n) {
        return (int) (-1 + Math.sqrt(8 * (long)n + 1)) / 2;

    }
}