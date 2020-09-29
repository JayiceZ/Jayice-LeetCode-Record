class MinStack {
    class Node{
        private int min;
        private int value;
        private Node next;
        public Node(int min,int value){
            this.min=min;
            this.value=value;
        }
    }


    Node head=null;

    /** initialize your data structure here. */
    public MinStack() {
        head=new Node(-1,-1);
    }

    public void push(int x) {
        Node node=head.next;
        Node newNode=new Node(x,x);
        if(node!=null){
            newNode.min=Math.min(node.min,x);
            newNode.next=node;
        }
        head.next=newNode;
    }

    public void pop() {
        head.next=head.next.next;
    }

    public int top() {
        return head.next.value;
    }

    public int getMin() {
        return head.next.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */