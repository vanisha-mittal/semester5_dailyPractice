// Last updated: 2/21/2026, 4:54:53 PM
1class Solution {
2    public double myPow(double x, int n) {
3        
4        if(n < 0){
5            n = -n;
6            x = 1 / x;
7        }
8        
9        double pow = 1;
10        
11        while(n != 0){
12            if((n & 1) != 0){
13                pow *= x;
14            } 
15                
16            x *= x;
17            n >>>= 1;
18            
19        }
20        
21        return pow;
22    }
23}