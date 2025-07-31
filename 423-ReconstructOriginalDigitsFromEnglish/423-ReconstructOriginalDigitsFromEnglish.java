// Last updated: 7/31/2025, 5:20:58 PM
import java.util.HashMap;

class Solution {
    public String originalDigits(String s) {
        int[] freq = new int[26];
        int[] digitCount = new int[10];  

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        digitCount[0] = freq['z' - 'a'];  
        digitCount[2] = freq['w' - 'a'];  
        digitCount[4] = freq['u' - 'a'];  
        digitCount[6] = freq['x' - 'a'];  
        digitCount[8] = freq['g' - 'a'];  

        digitCount[3] = freq['h' - 'a'] - digitCount[8];  
        digitCount[5] = freq['f' - 'a'] - digitCount[4];  
        digitCount[7] = freq['s' - 'a'] - digitCount[6];  

        digitCount[1] = freq['o' - 'a'] - digitCount[0] - digitCount[2] - digitCount[4];  
        digitCount[9] = freq['i' - 'a'] - digitCount[5] - digitCount[6] - digitCount[8];  

        StringBuilder res = new StringBuilder();
        for (int i = 0; i <= 9; i++) {
            while (digitCount[i]-- > 0) {
                res.append(i);
            }
        }

        return res.toString();
    }
}