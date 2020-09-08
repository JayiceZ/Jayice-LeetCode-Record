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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return func(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }

    private TreeNode func(int[] preorder, int[] inorder,int v1,int v2,int v3,int v4){
        if(v1>v2||v3>v4)
            return null;
        int val=preorder[v1];
        int index=-1;
        for(int i=v3;i<=v4;i++){
            if(inorder[i]==val){
                index=i;
                break;
            }
        }
        TreeNode node=new TreeNode(val);
        node.left=func(preorder,inorder,v1+1,v1+index-v3,v3,index-1);
        node.right=func(preorder,inorder,v1+index-v3+1,v2,index+1,v4);
        return node;
    }
}
