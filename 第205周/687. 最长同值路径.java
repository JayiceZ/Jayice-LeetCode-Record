给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。 这条路径可以经过也可以不经过根节点。

注意：两个节点之间的路径长度由它们之间的边数表示。

示例 1:

输入:

              5
             / \
            4   5
           / \   \
          1   1   5
输出:

2
示例 2:

输入:

              1
             / \
            4   5
           / \   \
          4   4   5
输出:

2

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/longest-univalue-path
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

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
    int myAns=0;
    public int longestUnivaluePath(TreeNode root) {
        func(root);
        return myAns;
    }

    private int func(TreeNode node){
        if(node==null)
            return -1;
        int left=func(node.left);
        int right=func(node.right);
        int ans=0;
        int tall=0;
        if(left!=-1&&right!=-1&&node.left.val==node.val&&node.right.val==node.val){
            ans=left+right+2;
            tall=Math.max(left,right)+1;
        }
        if(left!=-1&&node.left.val==node.val){
            ans=Math.max(ans,left+1);
            tall=Math.max(tall,left+1);
        }
        if(right!=-1&&node.right.val==node.val){
            ans=Math.max(ans,right+1);
            tall=Math.max(tall,right+1);
        }
        myAns=Math.max(myAns,ans);
        return tall;
    }
}
