// Last updated: 7/31/2025, 5:20:25 PM
import java.util.*;

class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] last = new int[26];

        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        List<Integer> result = new ArrayList<>();
        int maxLast = 0, prevEnd = -1;

        for (int i = 0; i < s.length(); i++) {
            maxLast = Math.max(maxLast, last[s.charAt(i) - 'a']);

            if (i == maxLast) {
                result.add(i - prevEnd);
                prevEnd = i;
            }
        }

        return result;
    }
}