// Last updated: 7/31/2025, 5:13:58 PM
class Solution {
    public int sumOfMultiples(int n) {
        return div_sum(n,3)+div_sum(n,5)+div_sum(n,7)-div_sum(n,3*5)-div_sum(n,3*7)-div_sum(n,7*5)+div_sum(n,3*5*7);
    }
     public int div_sum(int n, int k){
        int c= n / k;
        int an = k + (c-1) * k;
        return c * (k + an) / 2;
    }
}