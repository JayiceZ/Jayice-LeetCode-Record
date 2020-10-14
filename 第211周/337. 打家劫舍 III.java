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
    public int rob(TreeNode root) {
        int[] ans=dfs(root);
        return Math.max(ans[0],ans[1]);
    }

    private int[] dfs(TreeNode node){
        int[]ans=new int[2];
        if(node==null)
            return ans;
        int[] left=dfs(node.left);
        int[] right=dfs(node.right);
        ans[0]=node.val+left[1]+right[1];
        ans[1]=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        return ans;
    }
}