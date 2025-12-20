// Last updated: 12/20/2025, 10:10:01 PM
1class Solution {
2    private boolean rearrange(int maxValue,int index,int[] a){
3        int max = -1;
4		
5        for(int i = index; i<a.length;i++) if(a[i]<=maxValue && (max==-1 || a[max]<a[i])) max = i;
6        if(max==-1) return false;
7
8        int temp = a[max];
9        a[max] = a[index];
10        a[index] = temp;
11        return true;
12    }
13    public String largestTimeFromDigits(int[] a) {
14        boolean res = (rearrange(2,0,a) && (a[0]==2 ? rearrange(3,1,a) : rearrange(9,1,a)) && rearrange(5,2,a) && rearrange(9,3,a)) || (rearrange(1,0,a) && rearrange(9,1,a) && rearrange(5,2,a) && rearrange(9,3,a));
15        
16        StringBuilder sb = new StringBuilder();
17        
18        if(!res) return sb.toString();
19        
20        return sb.append(String.valueOf(a[0]))
21          .append(String.valueOf(a[1]))
22          .append(':')
23          .append(String.valueOf(a[2]))
24          .append(String.valueOf(a[3])).toString();
25    }
26}