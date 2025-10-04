// Last updated: 10/4/2025, 11:24:51 AM
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans = timeSeries.length * duration;
        for(int i = 0; i < timeSeries.length - 1; i++) {
            int gap = timeSeries[i + 1] - timeSeries[i];
            if(gap < duration) {
                ans -= (duration - gap);
            }
        }

        return ans;
    }
}