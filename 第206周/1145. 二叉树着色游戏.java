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
    private int left;
    private int right;
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        getNum(root,x);
        return n/2<Math.max(Math.max(left,right),n-left-right-1);
    }

    private int getNum(TreeNode node,int x){
        if(node==null)
            return 0;
        int left=getNum(node.left,x),right=getNum(node.right,x);
        if(x==node.val){
            this.left=left;
            this.right=right;
        }
        return left+right+1;
    }
}
