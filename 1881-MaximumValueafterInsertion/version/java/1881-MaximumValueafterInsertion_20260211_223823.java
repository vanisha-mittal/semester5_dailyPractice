// Last updated: 2/11/2026, 10:38:23 PM
1class Solution {
2    public String maxValue(String n, int x) {
3        StringBuilder sb = new StringBuilder();
4        if(n.charAt(0)=='-'){
5            sb.append('-');
6            int i=1;
7            while(i<n.length()&&(n.charAt(i)-'0')<=x){
8                i++;
9            }
10            sb.append(n.substring(1,i));
11            sb.append(Integer.toString(x));
12            sb.append(n.substring(i));
13        }else{
14            int i=0;
15            while(i<n.length()&&(n.charAt(i)-'0')>=x){
16                i++;
17            }
18            sb.append(n.substring(0,i));
19            sb.append(Integer.toString(x));
20            sb.append(n.substring(i));
21        }
22        return sb.toString();
23    }
24}