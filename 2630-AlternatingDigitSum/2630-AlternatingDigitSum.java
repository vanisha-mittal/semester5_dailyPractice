// Last updated: 7/31/2025, 5:14:59 PM
class Solution {
    public int alternateDigitSum(int n) {
        int c=0;
        int a=n;
        while(a>0){
            c++;
            a/=10;
        }
        int pos;
        int sum=0;
        if(c%2==0){
            pos=-1;
        }
        else{
            pos=1;
        }
        while(n>0){
            sum+=((n%10)*pos);
            pos*=-1;
            n/=10;
        }
        return sum;
        
    }
}