// Last updated: 9/10/2025, 12:39:37 PM
class Solution {
    public double new21Game(int n, int k, int maxPts) {
        if (k == 0 || n >= k - 1 + maxPts) return 1.0;

        double[] dp = new double[maxPts]; 
        dp[0] = 1.0;
        double sum = 1.0, result = 0.0;

        for (int i = 1; i <= n; i++) {
            double prob = sum / maxPts;
            
            if (i < k) {
                sum += prob;
            } else {
                result += prob;
            }

            if (i >= maxPts) {
                sum -= dp[i % maxPts];
            }

            dp[i % maxPts] = prob;
        }

        return result;
    }
}