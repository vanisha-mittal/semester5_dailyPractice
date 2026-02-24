// Last updated: 2/24/2026, 10:34:46 AM
1class Solution {
2    public String makeLargestSpecial(String s) {
3        List<String> ans=new ArrayList<>();
4        int count=0;
5        int strt=0;
6        for (int i=0;i<s.length();i++) {
7            if (s.charAt(i)=='1'){
8                count++;
9            }
10            else{
11                count--;
12            }
13            if(count==0) {
14                String inner=makeLargestSpecial(s.substring(strt+1,i));
15                ans.add("1"+inner+"0");
16                strt=i+1;
17            }
18        }
19        Collections.sort(ans,Collections.reverseOrder());
20        StringBuilder sb=new StringBuilder();
21        for (int i=0;i<ans.size();i++) {
22            sb.append(ans.get(i));
23        }
24        return sb.toString();
25    }
26}