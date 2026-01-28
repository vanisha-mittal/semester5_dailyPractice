// Last updated: 1/28/2026, 11:34:20 AM
class Solution {
    public char kthCharacter(int k) {
        int shifts = countShifts(k - 1);
        return (char) ('a' + shifts);
    }

   
    private int countShifts(int index) {
        return Integer.bitCount(index);
    }
}
