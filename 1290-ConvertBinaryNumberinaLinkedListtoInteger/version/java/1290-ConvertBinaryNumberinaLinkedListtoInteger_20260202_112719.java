// Last updated: 2/2/2026, 11:27:19 AM
1class Solution {
2    public int getDecimalValue(ListNode head) {
3        int num = 0;
4        while (head != null) {
5            num = num * 2 + head.val;
6            head = head.next;
7        }
8        return num;
9    }
10}