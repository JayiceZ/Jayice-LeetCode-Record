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
    public int findTilt(TreeNode root) {
        count(root);
        return ans;
    }

    private int count(TreeNode node){
        if(node==null)
            return 0;
        int left=count(node.left);
        int right=count(node.right);
        
        ans+=Math.abs(left-right);

        return left+right+node.val;
    }
}
