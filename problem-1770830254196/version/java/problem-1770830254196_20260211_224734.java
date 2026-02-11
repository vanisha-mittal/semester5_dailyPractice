// Last updated: 2/11/2026, 10:47:34 PM
1class Solution {
2   long [][][] dp;
3    int mod = (int)1e9+7;
4    int k;
5    public int countKReducibleNumbers(String s, int k) {
6        this.k = k;
7        char [] a = s.toCharArray();
8        int n= a.length;
9        dp = new long[2][n+1][n+1];
10        for (int i = 0; i <=n; i++) {
11            Arrays.fill(dp[0][i], -1);
12            Arrays.fill(dp[1][i], -1);
13
14        }
15        int cntOfOne=0;
16        for(char c : a){
17            if(c=='1')cntOfOne++;
18        }
19        return (int)((solve(a,0,0,0)-isReducible(cntOfOne)+mod)%mod);
20    }
21    
22    int isReducible(int n){
23        if(n==0)return 0;
24        int cnt =1; 
25        while (n>1){
26            cnt++;
27            n = Integer.bitCount(n);
28        }
29        return cnt<=k?1:0;
30    }
31
32    
33    long solve(char [] a ,int i,int cnt,int taken){
34        if(i==a.length){
35            return isReducible(cnt);
36        }
37        if(dp[taken][i][cnt]!=-1) return dp[taken][i][cnt];
38        long ans=0;
39        
40       
41        if(taken==0){
42            if(a[i]=='1'){
43                ans+=solve(a,i+1,cnt+1,0); 
44                ans+=solve(a,i+1,cnt,1); 
45            }else{
46                ans+=solve(a,i+1,cnt,0); // you can't change.
47            }
48        }else{
49            if(a[i]=='1') {
50                ans += solve(a, i + 1, cnt + 1, 1); // take it as it is
51            }else{
52                ans+=solve(a,i+1,cnt+1,taken); // change 0 to 1.
53            }
54            ans+=solve(a,i+1,cnt,taken); // change it 0
55        }
56        return dp[taken][i][cnt] = ans%mod;
57    }
58}