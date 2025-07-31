// Last updated: 7/31/2025, 5:18:55 PM
class Solution {
    public int getDecimalValue(ListNode head) {
        int num = 0;
        while (head != null) {
            num = num * 2 + head.val;
            head = head.next;
        }
        return num;
    }
}