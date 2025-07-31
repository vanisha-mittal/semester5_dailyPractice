// Last updated: 7/31/2025, 5:19:17 PM
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ll= new ArrayList<>();
        String digits = "123456789";
        for (int length = 2; length <= 9; length++) {
            for (int start = 0; start <= 9 - length; start++) {
                int num = Integer.parseInt(digits.substring(start, start + length));
                if (num >= low && num <= high) {
                    ll.add(num);
                }
            }
        }
        return ll;
    }
}