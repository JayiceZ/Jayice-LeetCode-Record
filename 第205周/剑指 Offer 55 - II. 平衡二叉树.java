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
    boolean flag=true;
    public boolean isBalanced(TreeNode root) {
        func(root);
        return flag;
    }

    private int func(TreeNode node){
        if(node==null)
            return 0;
        int left=func(node.left);
        if(left==-1)
            return -1;
        int right=func(node.right);
        if(right==-1)
            return -1;
        if(Math.abs(left-right)>1){
            flag=false;
            return -1;
        }
        return Math.max(left,right)+1;
    }
}
