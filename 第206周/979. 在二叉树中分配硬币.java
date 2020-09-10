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
    private int ans=0;
    public int distributeCoins(TreeNode root) {
        backOrder(root);
        return ans;
    }

    private int backOrder(TreeNode node){
        if(node==null)
            return 0;
        node.val+=backOrder(node.left);
        node.val+=backOrder(node.right);
        ans+=Math.abs(node.val-1);
        return node.val-1;
    }
}
