// Last updated: 7/31/2025, 5:20:52 PM
class Solution {
    public boolean detectCapitalUse(String word) {
        
        if (word.length() == 1)
            return true;
            
        boolean lowerCase = false, upperCase = false, firstUpper = false;

        if (word.charAt(0) >= 'a' && word.charAt(0) <= 'z') {
            lowerCase = true;
        }
        else if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
            if (word.charAt(1) >= 'A' && word.charAt(1) <= 'Z') {
                upperCase = true;
            }
            else {
                firstUpper = true;
            }
        }

        for (int i=1; i<word.length(); i++) {

            if (lowerCase || firstUpper) {
                if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                    return false;
                }
            }
            else if (upperCase) {
                if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                    return false;
                }
            }
        }
        return true;
    }
}