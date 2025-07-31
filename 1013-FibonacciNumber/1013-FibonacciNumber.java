// Last updated: 7/31/2025, 5:19:24 PM
class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        int c=1;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        n-=2;
        while(n>0){
            a=b;
            b=c;
            c=a+b;
            n--;
        }
        return c;
    }
}