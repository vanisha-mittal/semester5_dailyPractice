// Last updated: 7/31/2025, 5:12:46 PM
class Solution {
    public int distributeCandies(int n, int limit) {
        
        int res = 0;

        for (int i = 0; i <= limit; i++) {
            for (int j = 0; j <= limit; j++) {
                if (i + j <= n && limit >= n-i-j) {
                    res++;
                }
            }
        }

        return res;
    }
}