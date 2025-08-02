// Last updated: 8/2/2025, 4:04:52 PM
class Solution {
    public int jump(int[] nums) {
        int far=0,near=0,jump=0;
        while(far<nums.length-1)
        {
            int farthest=0;
            for(int i=near;i<=far;i++)
            {
                farthest=Math.max(farthest,i+nums[i]);
            }
            near=far+1;
            far=farthest;
            jump++;
        }
        return jump;

    }
}