/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        //Create a copy of the nodes in between original nodes
        Node temp = head;
        while(temp != null){
            Node copyNode = new Node(temp.val);
            copyNode.next = temp.next;
            temp.next = copyNode;
            temp = temp.next.next;
        }
        //Connect the random of the copyNode according to the original nodes
        temp = head;
        while(temp != null){
            Node copyNode = temp.next;
            if(temp.random != null) copyNode.random = temp.random.next;
            else copyNode.random = null;
            temp = temp.next.next;
        }
        //Connect the next of the copyNodes
        temp = head;
        Node dNode = new Node(-1);
        Node res = dNode;
        while(temp != null){
            res.next = temp.next;
            temp.next = temp.next.next;
            res = res.next;
            temp = temp.next;
        }
        return dNode.next;
        
    }
}