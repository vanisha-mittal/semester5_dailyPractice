// Last updated: 11/22/2025, 8:17:37 PM
class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int i=num1;i<=num2;i++){
            ans+=wave(i);
        }
        return ans;
    }
    public static int wave(int n){
        String s=Integer.toString(n);
        if(s.length()<3) return 0;

        int c=0;
        for(int i=1;i<s.length()-1;i++){
            int prev = s.charAt(i - 1) - '0';
            int curr = s.charAt(i) - '0';
            int next = s.charAt(i + 1) - '0';
            if (curr > prev && curr > next) {
                c++; 
            } else if (curr < prev && curr < next) {
                c++; 
            }
        }
        return c;
    }
}