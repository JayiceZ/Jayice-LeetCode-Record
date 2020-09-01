给定一个 N 叉树，返回其节点值的后序遍历。

例如，给定一个 3叉树 :

 



 

返回其后序遍历: [5,6,3,2,4,1].

 /*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        Stack<Node>stack=new Stack();
        LinkedList<Integer>ans=new LinkedList();
        if(root==null)
            return ans;
        stack.add(root);
        while(stack.size()!=0){
            Node node=stack.pop();
            ans.addFirst(node.val);
            for(Node child:node.children){
                stack.add(child);
            }
        }
        return ans;
    }
}
