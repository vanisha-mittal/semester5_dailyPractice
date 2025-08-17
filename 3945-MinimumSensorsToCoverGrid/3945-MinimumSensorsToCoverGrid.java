// Last updated: 8/17/2025, 5:32:07 PM
class Solution {
    public int minSensors(int n, int m, int k) {
        int c = 2*k+1;
        int rows = (n + c - 1) / c;
        int cols = (m + c - 1) / c;
        return rows * cols;

    }
}