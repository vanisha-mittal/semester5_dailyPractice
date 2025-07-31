// Last updated: 7/31/2025, 5:22:14 PM
class Solution {
    public String largestNumber(int[] nums) {
        String[] numS = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numS[i] = String.valueOf(nums[i]);}
        for(int i=0; i<nums.length-1;i++)
        {
            for(int j=0;j<nums.length-1;j++)
            {
                String s1=numS[j]+numS[j+1];
                String s2=numS[j+1]+numS[j];
                int res=s1.compareTo(s2);
                if(res<0)
                {
                    String temp=numS[j];
                    numS[j]=numS[j+1];
                    numS[j+1]=temp;
                }
            }
        }
        if (numS[0].equals("0")) {
            return "0";}
        String s3="";
        for(int i=0;i<numS.length;i++)
        {
            s3+=numS[i];
        }
        int f=0;
        return s3;
    }
}