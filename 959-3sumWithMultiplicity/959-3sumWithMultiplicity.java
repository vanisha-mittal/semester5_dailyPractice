// Last updated: 7/31/2025, 5:19:27 PM
class Solution {
    public int threeSumMulti(int[] nums, int target) {
        Arrays.sort(nums);
        long[] f=new long[101];
        for(int i=0;i<nums.length;i++){
            f[nums[i]]++;
        }
        long c=0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];
                if (total > target) {
                    k--;
                } else if (total < target) {
                    j++;
                } else {
                    if(nums[i]==nums[j]&&nums[j]==nums[k]){
                        System.out.println(f[nums[i]]);
                        c+=((f[nums[i]]*(f[nums[i]]-1)*(f[nums[i]]-2))/6.0)%1000000007;
                        System.out.println(c);
                    }
                    else if(nums[i]==nums[j]||nums[j]==nums[k]){
                        c=(c%1000000007)+(f[nums[i]]*(f[nums[j]]-1)*f[nums[k]]/2);
                    }
                    else if(nums[k]==nums[i]){
                        c=(c%1000000007)+((f[nums[i]]-1)*f[nums[j]]*f[nums[k]]/2);
                    }
                    else{
                        c=(c%1000000007)+(f[nums[i]]*f[nums[j]]*f[nums[k]]);
                    }
                    
                    j++;
                    while ( j < k && nums[j] == nums[j-1]) {
                        j++;
                    }
                    k--;
                    while (nums[k] == nums[k+1] && j < k) {
                        k--;
                    }
                }
            }
        }
        return (int)c%1000000007;        
    }
}  