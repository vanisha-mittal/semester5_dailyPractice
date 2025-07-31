// Last updated: 7/31/2025, 5:20:24 PM
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int sum = 0;
        int expectedSum = 0;
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            expectedSum += i;
            if (sum == expectedSum) {
                c++;
            }
        }
        return c;
    }
}