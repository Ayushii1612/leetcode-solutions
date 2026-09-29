/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int currJumps = n;
        ListNode cur = head;

        //length
        while(currJumps > 0){
            cur = cur.next;
            currJumps = currJumps - 1;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while(cur != null){
            cur = cur.next;
            prev = prev.next;
        }
        prev.next = prev.next.next;

        return dummy.next;
    }
}