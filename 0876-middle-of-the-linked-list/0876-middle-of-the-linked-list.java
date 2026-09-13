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
    public ListNode middleNode(ListNode head) {
        //Brute force => Traverse once to find the length of the linked list.
        //Traverse again until you get the middle element.
        //TC => O(N+N)

        //Use two pointers, one will move at speed double of second pointer
        if(head == null || head.next == null) return head;

        ListNode pointer1 = head;
        ListNode pointer2 = head;
        while(pointer1 != null && pointer1.next != null){
            pointer1 = pointer1.next.next;
            pointer2 = pointer2.next;
        }
        return pointer2;
    }
}