// Last updated: 1/26/2026, 5:06:06 PM
1class Solution {
2    public List<List<Integer>> minimumAbsDifference(int[] arr) {
3        Arrays.sort(arr);
4        long diff=Long.MAX_VALUE; 
5        for(int i=0;i<arr.length-1;i++){
6            diff=Math.min(diff, Math.abs(arr[i]-arr[i+1]));
7        }
8        List<List<Integer>> ans=new ArrayList<>();
9        for(int i=0;i<arr.length-1;i++){
10            if(arr[i+1]-arr[i]==diff){
11                ans.add(Arrays.asList(arr[i],arr[i+1]));
12            }
13        }
14        return ans;
15    }
16}