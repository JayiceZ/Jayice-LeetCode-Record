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
    public int countNodes(TreeNode root) {
        if(root==null)
            return 0;
        int leftDepth=getDepth(root.left);
        int rightDepth=getDepth(root.right);

        if(leftDepth==rightDepth)
            return (1<<leftDepth)+countNodes(root.right);
        else
            return (1<<rightDepth)+countNodes(root.left);
    }
    private int getDepth(TreeNode node){
        if(node==null)
            return 0;
        int ans=0;
        while(node!=null){
            ans++;
            node=node.left;
        }
        return ans;
    }
}
