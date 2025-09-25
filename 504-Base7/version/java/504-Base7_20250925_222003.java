// Last updated: 9/25/2025, 10:20:03 PM
class Solution {
    public String convertToBase7(int num) {
        StringBuilder sb=new StringBuilder();
        int n=num,s=num;
        if(n<0) n=num+(num*-2);
        if(n==0) return "0";
        while(n!=0){
            int rem=n%7;
            sb.append(rem);
            n=n/7;
        }
        sb.reverse();
        if(num<0) sb.insert(0, "-");
        return sb.toString();
    }
}