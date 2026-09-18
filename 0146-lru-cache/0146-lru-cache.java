class LRUCache {
    class Node{
        Node next;
        Node prev;
        int key;
        int val;
        Node(int key_ , int val_){
            key = key_;
            val = val_;
        }
    }
    Map<Integer, Node> mpp = new HashMap<>();
    int cap;
    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);
    public LRUCache(int capacity) {
        head.next = tail;
        tail.prev = head;
        cap = capacity;
    }
    
    public int get(int key) {
        if(!mpp.containsKey(key)) return -1;
        Node node = mpp.get(key);
        deleteNode(node);
        insertAtHead(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(mpp.containsKey(key)){
            Node node = mpp.get(key);
            node.val = value;
            deleteNode(node);
            insertAtHead(node);
        }
        else{
            if(mpp.size() == cap){
                Node node = tail.prev;
                mpp.remove(node.key);
                deleteNode(node);
            }
            Node node = new Node(key, value);
            mpp.put(key,node);
            insertAtHead(node);
        }
    }
    public void deleteNode(Node node){
        Node prevNode = node.prev;
        Node afterNode = node.next;
        prevNode.next = afterNode;
        afterNode.prev = prevNode;
        node.next = null;
        node.prev = null;
    }
    public void insertAtHead(Node node){
        Node currAfterHead = head.next;
        head.next = node;
        node.next = currAfterHead;
        currAfterHead.prev = node;
        node.prev = head;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */