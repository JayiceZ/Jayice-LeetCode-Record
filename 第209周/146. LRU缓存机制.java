class LRUCache {

    class Node{
        private int key;
        private int value;
        private Node pre;
        private Node next;

        public Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }

    private Node head;
    private Node tail;
    private int capacity;
    private int size;
    private Map<Integer,Node> map;

    private void addNode(Node node){
        node.next=head.next;
        node.pre=head;
        head.next.pre=node;
        head.next=node;
    }

    private void removeNode(Node node){
        Node pre=node.pre;
        Node next=node.next;
        pre.next=next;
        next.pre=pre;
    }

    private void removeToHead(Node node){
        removeNode(node);
        addNode(node);
    }

    private Node popTail(){
        Node node=tail.pre;
        removeNode(node);
        return node;
    }

    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.size=0;
        this.head=new Node(-1,-1);
        this.tail=new Node(-1,-1);
        head.next=tail;
        tail.pre=head;
        this.map=new HashMap();
    }

    public int get(int key) {
        Node node=map.get(key);
        if(node!=null){
            removeToHead(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        Node node=map.get(key);
        if(node!=null){
            node.value=value;
            removeToHead(node);
        }else{
            Node newNode=new Node(key,value);
            addNode(newNode);
            map.put(key,newNode);
            this.size++;
        }
        if(size>capacity){
            Node oldNode=popTail();
            map.remove(oldNode.key);
            size--;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */