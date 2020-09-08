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
    public void flatten(TreeNode root) {
        if(root==null)
            return;
         flatten(root.left);
         flatten(root.right);
         TreeNode left=root.left,right=root.right;
        if(left==null)
            return;
        TreeNode temp=left;
        while(temp.right!=null)
            temp=temp.right;
        temp.right=right;
        root.right=left;
        root.left=null;
    }
}
