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
    TreeNode node;
    TreeNode pre;
    public TreeNode convertBiNode(TreeNode root) {
        inOrder(root);
        return node;
    }

    private void inOrder(TreeNode root){
        if(root==null)
            return;
        inOrder(root.left);
        if(node==null){
            node=root;
        }
        if(pre!=null){
            pre.right=root;
            root.left=null;
        }
        pre=root;
        inOrder(root.right);
    }
}
