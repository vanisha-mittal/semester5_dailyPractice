// Last updated: 7/31/2025, 5:21:12 PM
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int[] arr={8,7,6,5,4,3,2};
        if(n==0){
            return 1;
        }
        if(n==1){
            return 10;
        }
        return unique_digits(n,arr);
    }
    public static int unique_digits(int n,int[] arr){
        if(n==2){
            return 91;
        }
        int a=81;
        for(int i=0;i<=n-3;i++){
            a*=arr[i];
        }
        return a+unique_digits(n-1,arr);
    }
}