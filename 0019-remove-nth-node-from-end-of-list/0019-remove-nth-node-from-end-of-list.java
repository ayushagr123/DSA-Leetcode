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
        if(head == null || head.next == null) return null;
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        int count = 0;
        while(count < n){
            ptr2 = ptr2.next;
            count++;
        }
        if(ptr2 == null) {
            ListNode temp = head.next;
            head.next = null;
            return temp; 
        }
        while(ptr2.next != null){
            ptr2 = ptr2.next;
            ptr1 = ptr1.next;
        }
        ListNode nth = ptr1.next;
        ptr1.next = nth.next;
        nth.next = null;
        return head;
    }
}