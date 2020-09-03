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
    int ans=0;
    int k=0;
    public int kthLargest(TreeNode root, int k) {
        this.k=k;
        deInOrder(root);
        return ans;
    }

    private void deInOrder(TreeNode root){
        if(root==null||k==0)
            return;
        deInOrder(root.right);
        if(k==0)
            return;
        k--;
        if(k==0){
            ans=root.val;
            return;
        }

        deInOrder(root.left);
    }
}
