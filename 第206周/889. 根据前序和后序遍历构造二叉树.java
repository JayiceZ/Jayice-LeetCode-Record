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
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        return build(pre,post,0,pre.length-1,0,post.length-1);
    }

    private TreeNode build(int[] pre,int[] post,int v1,int v2,int v3,int v4){
        if(v1>v2||v3>v4)
            return null;
        if(v1==v2)
            return new TreeNode(pre[v1]);
        int root=pre[v1];
        TreeNode node=new TreeNode(root);
        int left=pre[v1+1];
        int index=-1;
        for(int i=v3;i<=v4;i++){
            if(post[i]==left){
                index=i;
                break;
            }
        }
        node.left=build(pre,post,v1+1,v1+1+index-v3,v3,index);
        node.right=build(pre,post,v1+2+index-v3,v2,index+1,v4-1);
        return node;
    }
}
