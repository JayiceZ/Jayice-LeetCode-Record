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
    public TreeNode mirrorTree(TreeNode root) {
        return func(root);
    }

    private TreeNode func(TreeNode node){
        if(node==null)
            return null;
        TreeNode left=func(node.left);
        TreeNode right=func(node.right);
        node.left=right;
        node.right=left;
        return node;
    }
}
