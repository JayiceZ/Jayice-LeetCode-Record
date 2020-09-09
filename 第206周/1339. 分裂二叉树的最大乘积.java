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
    long val;
    long ans=0;
    public int maxProduct(TreeNode root) {
        val=func(root);
        getAns(root);
        return (int)(ans%(1000000007));
    }

    private int func(TreeNode node){
        if(node==null)
            return 0;
        int left=func(node.left);
        int right=func(node.right);

        node.val+=(left+right);
        return node.val;
    }

    private void getAns(TreeNode node){
        if(node==null)
            return;
        getAns(node.left);
        getAns(node.right);
        ans=Math.max(ans,(val-node.val)*node.val);
    }
}
