// Last updated: 7/31/2025, 5:09:52 PM
class Solution {
    public int possibleStringCount(String word) {
        long ans = 1;                          
        for (int i = 0, n = word.length(); i < n; ) {
            int j = i;
            while (j < n && word.charAt(j) == word.charAt(i)) j++;
            ans += (j - i - 1);                  
            i = j;
        }
        return (int) ans;
    }
}