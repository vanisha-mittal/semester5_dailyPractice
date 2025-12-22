// Last updated: 12/22/2025, 6:55:37 PM
1class Solution {
2    public String generateTag(String str){
3
4        String[] arr= str.trim().split(" ");
5        if (arr.length < 1) return "#";
6        
7        StringBuilder sb = new StringBuilder();
8        sb.append('#');
9        sb.append(arr[0].toLowerCase());
10
11        for(int i=1; i<arr.length; i++){
12            int wordlen=arr[i].length();
13            if(wordlen==0) continue;
14            sb.append(arr[i].substring(0,1).toUpperCase());
15            sb.append(arr[i].substring(1).toLowerCase());
16            if(sb.length()>=100) break;
17        }
18
19        String ans= sb.toString();
20
21        if(ans.length()>=100){
22            return ans.substring(0, 100);
23        }
24        
25        return ans;
26    }
27}