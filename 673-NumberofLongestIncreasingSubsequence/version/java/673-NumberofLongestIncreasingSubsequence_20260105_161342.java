// Last updated: 1/5/2026, 4:13:42 PM
1class Solution {
2    HashMap<String, Integer> dp=new HashMap<>();
3    public int longestStrChain(String[] words) {
4        ArrayList<String> arr=new ArrayList<>();
5        for(String s : words){
6            arr.add(s);
7        }
8        int max=1;
9        for(int i=0;i<arr.size();i++){
10            max=Math.max(chain(arr,arr.get(i)),max);
11        }
12        return max;
13    }
14    public int chain(ArrayList<String> arr,String curr){
15        if (dp.containsKey(curr)) return dp.get(curr);
16        int max=1;
17
18        for(int j=0;j<curr.length();j++){
19            String s=curr.substring(0,j)+curr.substring(j+1);
20            if(arr.contains(s)){
21                max=Math.max(chain(arr,s)+1,max);
22            }
23        }
24        dp.put(curr,max);
25         return max;
26    }
27}