// Last updated: 12/27/2025, 7:22:00 PM
1class Solution {
2    public int countBeautifulPairs(int[] nums) {
3        int n = nums.length;
4        int count =0;
5        for(int i=0; i<n; i++){
6            int first = nums[i];
7            while(first>9){
8                first/=10;
9            }
10            for(int j=i+1; j<n; j++){
11                if(gcd(first,nums[j]%10)==1){
12                    count++;
13                }
14            }
15        }
16        return count;
17    }
18    
19     static int gcd(int a, int b)
20    {
21        if (b == 0)
22            return a;
23        else
24            return gcd(b, Math.abs(a - b));
25    }
26}