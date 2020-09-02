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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null&&t==null)
            return true;
        if(s==null||t==null)
            return false;
        return isSameTree(s,t)||isSubtree(s.left,t)||isSubtree(s.right,t);
    }

    private boolean isSameTree(TreeNode node1,TreeNode node2){
        if(node1==null&&node2==null)
            return true;
        else if(node1==null||node2==null)
            return false;
        return node1.val==node2.val&&isSameTree(node1.left,node2.left)&&isSameTree(node1.right,node2.right);
    }
}
