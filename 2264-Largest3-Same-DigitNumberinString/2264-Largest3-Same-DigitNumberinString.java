// Last updated: 8/14/2025, 10:26:11 AM
class Solution {
    public String largestGoodInteger(String num) {
        String ans = "";
        for (int i = 0; i< num.length()-2; i++) {
            if (num.charAt(i)== num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)) {
                ans=ans.compareTo(num.substring(i, i+3))>0?ans:num.substring(i, i+3);
            }
        }
        return ans;
    }
}