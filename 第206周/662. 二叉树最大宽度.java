/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        Queue<Node>queue=new LinkedList();
        queue.add(new Node(root,1));
        int ans=0;
        while(queue.size()!=0){
            int size=queue.size();
            int left=0,right=0;
            for(int i=0;i<size;i++){
                Node node=queue.poll();
                if(i==0)
                    left=node.index;
                if(i==size-1)
                    right=node.index;
                if(node.treeNode.left!=null)
                    queue.add(new Node(node.treeNode.left,2*node.index));
                if(node.treeNode.right!=null)
                    queue.add(new Node(node.treeNode.right,2*node.index+1));
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}

class Node{
    TreeNode treeNode;
    int index;

    public Node(TreeNode treeNode,int index){
        this.treeNode=treeNode;
        this.index=index;
    }
}
