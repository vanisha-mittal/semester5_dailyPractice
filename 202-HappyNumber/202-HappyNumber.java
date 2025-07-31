// Last updated: 7/31/2025, 5:22:03 PM
class Solution {
    static boolean c=false;
    public boolean isHappy(int n) {
        happy(n);
        return c;
    }
    public static void happy(int n){
        if(n==1 || n==7){
            c=true;
            return;
        }
        if(n<10){
            c=false;
            return;
        }
        happy(Sum(n));
    }
    public static int Sum(int n){
        int ans=0;
        while(n>0){
            ans+=Math.pow(n%10,2);
            n/=10;
        }
        return ans;
    }
}