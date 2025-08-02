// Last updated: 8/2/2025, 4:02:50 PM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i=0, j=n-1;

        while(i<j){
            if(numbers[i]+numbers[j] == target) break;
            if(numbers[i]+numbers[j] < target) i++;
            else j--;
        }

        int[] ans = {i+1, j+1};
        return ans;
    }
}
