/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return func(root).node;
    }
    private Response func(TreeNode node){
        if(node==null)
            return new Response(null,0);
        Response left=func(node.left),right=func(node.right);
        if(left.dist>right.dist){
            left.dist+=1;
            return left;
        }else if(left.dist<right.dist){
            right.dist+=1;
            return right;
        }
        left.dist+=1;
        left.node=node;
        return left;
    }
}

class Response{
    TreeNode node;
    int dist;

    public Response(TreeNode node,int dist){
        this.node=node;
        this.dist=dist;
    }
}
