// Last updated: 7/31/2025, 5:10:03 PM
class Solution {
    public String convertDateToBinary(String date) {
        long a=Integer.parseInt(date.substring(0,4));
        long b=Integer.parseInt(date.substring(5,7));
        long c=Integer.parseInt(date.substring(8,10));
        return binary(a)+"-"+binary(b)+"-"+binary(c);
    }
    public long binary(long n){
        	long sum=0;
            long mul=1;
            while(n>0) {
                long rem=n%2;
                sum+=rem*mul;
                n/=2;
                mul*=10;
            }
            return sum;
    }
}