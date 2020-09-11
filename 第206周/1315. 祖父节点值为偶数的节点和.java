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
    public int sumEvenGrandparent(TreeNode root) {
        dfs(root,1,1);
        return ans;
    }
    private void dfs(TreeNode node,int parentVal,int grandParentVal){
        if(node==null)
            return;
        if(grandParentVal%2==0)
            ans+=node.val;
        dfs(node.left,node.val,parentVal);
        dfs(node.right,node.val,parentVal);
    }
}
