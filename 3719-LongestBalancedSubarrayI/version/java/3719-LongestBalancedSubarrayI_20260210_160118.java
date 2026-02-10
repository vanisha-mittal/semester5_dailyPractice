// Last updated: 2/10/2026, 4:01:18 PM
1class Solution {
2    public int longestBalanced(int[] nums) {
3        int n = nums.length;
4        int maxLen = 0;
5        for(int i = 0; i < n;i++){
6            //HashSet to count the distinct elements and avoid duplicates
7            Set<Integer> even = new HashSet<>();
8            Set<Integer> odd = new HashSet<>();
9            for(int j = i ; j < n;j++){
10                //check if it is Odd or Even
11                if(nums[j] % 2 == 0){
12                    even.add(nums[j]);
13                }else{
14                    odd.add(nums[j]);
15                }
16                //Update the maxLen when size of odd or even sets are equal
17                if(even.size() == odd.size()){
18                    maxLen = Math.max(maxLen, j - i + 1);
19                }
20            }
21        }
22        return maxLen;
23    }
24}