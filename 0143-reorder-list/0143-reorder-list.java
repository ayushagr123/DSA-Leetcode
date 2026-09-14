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
    public void reorderList(ListNode head) {
        //Use fast and slow pointers to reach the middle of the linked list.
        //Now reverse the second half of the linked list
        //Combine both the halves.

        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode second = slow.next;
        ListNode prev = null;
        slow.next = null;
        while(second!=null){
            ListNode store = second.next;
            second.next = prev;
            prev = second;
            second = store;
        }

        ListNode first = head;
        second = prev;
        while(second!=null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }

    }
}