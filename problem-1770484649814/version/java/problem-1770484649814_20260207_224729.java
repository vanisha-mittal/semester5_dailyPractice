// Last updated: 2/7/2026, 10:47:29 PM
1class Solution {
2    public int minimumOperations(int[] nums) {
3        int freq[][] = new int[100005][2];
4        int i, j, k, ans=0;
5        for(i = 0; i < nums.length; i++) {
6    			freq[nums[i]][i&1]++;
7    		}
8    		
9    		for(i = 1, j=k=0; i <= 100000; i++) {
10			// Add the maximum frequency of odd indexes to maximum frequency even indexes 
11		    //and vice versa, it will give us how many elements we don't need to change. 
12    		ans = Math.max(ans, Math.max(freq[i][0] + k, freq[i][1] + j));
13            j = Math.max(j, freq[i][0]);
14            k = Math.max(k, freq[i][1]);
15        }
16        return nums.length - ans;
17    }
18}