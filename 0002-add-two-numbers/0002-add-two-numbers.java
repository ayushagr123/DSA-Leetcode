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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int sum = 0;
        int carry = 0;
        ListNode Dnode = new ListNode(-1);
        ListNode prev = Dnode;
        while(temp1 != null && temp2 != null){
            sum = temp1.val + temp2.val + carry;
            ListNode newNode = new ListNode(sum%10);
            prev.next = newNode;
            prev = prev.next;
            carry = sum/10;
            temp1 = temp1.next;
            temp2 = temp2.next;   
        }
        while(temp1 != null){
            sum = temp1.val + carry;
            ListNode newNode = new ListNode(sum%10);
            prev.next = newNode;
            prev = prev.next;
            carry = sum/10;
            temp1 = temp1.next;
        }
        while(temp2 != null){
            sum = temp2.val + carry;
            ListNode newNode = new ListNode(sum%10);
            prev.next = newNode;
            prev = prev.next;
            carry = sum/10;
            temp2 = temp2.next;
        }

        if(carry == 1){
            ListNode newNode = new ListNode(1);
            prev.next = newNode;
        }
        return Dnode.next;
    }
}