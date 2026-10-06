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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        int s = 0;
        int e = lists.length-1;
        return partMerge(s,e,lists);
    }
    public static ListNode partMerge(int s, int e, ListNode[] lists){
        if(s==e) return lists[s];   //Base condition
        int mid = s+(e-s)/2;
        ListNode L1 = partMerge(s,mid,lists);
        ListNode L2 = partMerge(mid+1,e,lists);
        return mergeTwoList(L1,L2);
    }
    public static ListNode mergeTwoList(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        else if(l2 == null) return l1;
        ListNode curr, hold,fHead;
        if(l1.val<=l2.val) {
            curr = l1;
            hold = l2;
            fHead = l1;
        }
        else{
            curr = l2;
            hold = l1;
            fHead = l2;
        }
        while(curr.next != null){
            if(curr.next.val<=hold.val) {
                curr = curr.next;
            }
            else{
                ListNode store = curr.next;
                curr.next = hold;
                hold = store;
                curr = curr.next;
            }
        }
        curr.next = hold;
        return fHead;
    }
}
//2,2,3,4,4,5
//1,3,4,5,6