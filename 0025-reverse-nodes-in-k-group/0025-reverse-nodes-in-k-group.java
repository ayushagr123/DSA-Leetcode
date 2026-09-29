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
    public ListNode reverseKGroup(ListNode head, int k) {
        //Skip to the kth node.
        //Connect the head of the previous set of nodes to the current kth node. 
        //Reverse the first k nodes of the linked list.
        //Store the tail(head of the original group of nodes) of the current set of reversed k nodes.
        ListNode temp = head;
        ListNode prevTail = null;
        ListNode finalHead = null;
        while(temp != null){
            ListNode currHead = temp;
            int count = 1;
            //Skipping to the kth node
            while(temp != null && count!=k){
                temp = temp.next;
                count++;
            }
            if(temp == null) {
                prevTail.next = currHead;
                break;
            }
            else{
                ListNode newHead = temp.next;
                if(prevTail != null) prevTail.next = temp;
                else finalHead = temp;
                //Reverse the current group of k nodes
                reverse(currHead,temp);
                prevTail = currHead;
                temp = newHead;
            }
        }
        return finalHead;
    }
    public static void reverse(ListNode head, ListNode tail) {
        ListNode currHead = head;
        ListNode prev = null;
        while(currHead != tail){
            ListNode newHead = currHead.next;
            currHead.next = prev;
            prev = currHead;
            currHead = newHead;
        }
        currHead.next = prev;
    }
}