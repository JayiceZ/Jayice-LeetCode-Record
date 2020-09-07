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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return getAns(root).node;
    }

    private Response getAns(TreeNode node){
        if(node==null)
            return new Response(null,0);
        Response left=getAns(node.left),right=getAns(node.right);
        if(left.dist>right.dist)
            return new Response(left.node,left.dist+1);
        else if(left.dist<right.dist)
            return new Response(right.node,right.dist+1);
        return new Response(node,left.dist+1);
    }
}

class Response{
    int dist;
    TreeNode node;

    public Response(TreeNode node,int dist){
        this.dist=dist;
        this.node=node;
    }
}
