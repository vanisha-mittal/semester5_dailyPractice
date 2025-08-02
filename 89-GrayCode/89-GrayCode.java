// Last updated: 8/2/2025, 4:03:57 PM
class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> list= new ArrayList<>();

        for(int i=0;i<Math.pow(2,n);i++)
        {
            list.add(i^(i>>1));
        }
        return list;
        
    }
}