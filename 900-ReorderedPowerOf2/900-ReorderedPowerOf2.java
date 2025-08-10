// Last updated: 8/11/2025, 12:53:02 AM
class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] arr = getDigit(n);

        for (int i = 0; i < 31; i++) {
            int power = 1 << i;
            int[] powerArr = getDigit(power);

            if (Arrays.equals(arr, powerArr)) return true;
        }

        return false;
    }

    public int[] getDigit(int num) {
        int[] arr = new int[10];
        while (num > 0) {
            int digit = num % 10;
            arr[digit]++;
            num /= 10;
        }
        return arr;
    }
}