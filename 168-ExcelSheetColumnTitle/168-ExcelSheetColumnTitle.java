// Last updated: 8/9/2025, 7:16:00 PM
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            ans.insert(0, (char) ((columnNumber % 26) + 'A'));
            columnNumber /= 26;
        }

        return ans.toString();
    }
}