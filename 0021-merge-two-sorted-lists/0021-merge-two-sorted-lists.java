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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0) ;
        ListNode curr = new ListNode(0);
        ListNode hold = new ListNode(0);
        if(list1 == null) return list2;
        else if(list2 == null) return list1;
        if(list1.val>list2.val){
            hold = list1;
            curr = list2;
            head = list2;
        }
        else{
            hold = list2;
            curr = list1;
            head = list1;
        }
        while(curr.next!=null){
            if(curr.next.val > hold.val){
                ListNode store = curr.next;
                curr.next = hold;
                curr = hold;
                hold = store;
            }
            else{
                curr = curr.next;
            }
        }
        curr.next = hold;
        return head;
        
    }
}