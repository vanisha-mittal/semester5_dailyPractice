// Last updated: 4/23/2026, 9:45:31 PM
1class Solution {
2public:
3    vector<int> twoSum(vector<int>& nums, int target) {
4        unordered_map<int, int> numMap;
5        int n = nums.size();
6
7        for (int i = 0; i < n; i++) {
8            int complement = target - nums[i];
9            if (numMap.count(complement)) {
10                return {numMap[complement], i};
11            }
12            numMap[nums[i]] = i;
13        }
14
15        return {}; // No solution found
16    }
17};