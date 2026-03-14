// Last updated: 3/14/2026, 11:44:08 AM
1class Solution {
2    public String reversePrefix(String s, int k) {
3        if(k==1){
4            return s;
5        }
6
7        char[] arr= s.toCharArray();
8
9        int left = 0 ;
10        int right = k-1;
11        while(left <= right){
12            char temp = arr[left];
13            arr[left] = arr[right];
14            arr[right] = temp;
15
16            left++;
17            right--;
18        }
19
20        return new String(arr);
21    }
22}