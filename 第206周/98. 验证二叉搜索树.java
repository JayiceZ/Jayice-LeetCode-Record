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
    private Integer val=null;
    private boolean flag=true;
    public boolean isValidBST(TreeNode root) {
        inOrder(root);
        return flag;
    }
    private void inOrder(TreeNode node){
        if(node==null|!flag)
            return;
        inOrder(node.left);
        if(val!=null&&val>=node.val){
            flag=false;
            return;
        }
        val=node.val;
        inOrder(node.right);
    }
}
