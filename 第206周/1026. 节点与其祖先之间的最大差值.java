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
    public int maxAncestorDiff(TreeNode root) {
        return Math.max(search(root.left,root.val,root.val),search(root.right,root.val,root.val));
    }

    private int search(TreeNode node,int max,int min){
        if(node==null)
            return 0;
        max=Math.max(max,node.val);
        min=Math.min(min,node.val);

        if(node.left==null&&node.right==null)
            return max-min;
        return Math.max(search(node.left,max,min),search(node.right,max,min));
    }
}
