783. 二叉搜索树节点最小距离
给定一个二叉搜索树的根节点 root，返回树中任意两节点的差的最小值。

 

示例：

输入: root = [4,2,6,1,3,null,null]
输出: 1
解释:
注意，root是树节点对象(TreeNode object)，而不是数组。

给定的树 [4,2,6,1,3,null,null] 可表示为下图:

          4
        /   \
      2      6
     / \    
    1   3  

最小的差值是 1, 它是节点1和节点2的差值, 也是节点3和节点2的差值。

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
    int pre=-1,ans=Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        inOrder(root);
        return ans;
    }

    private void inOrder(TreeNode node){
        if(node==null){
            return;
        }

        inOrder(node.left);
        if(pre!=-1){
            ans=Math.min(ans,node.val-pre);
        }
        pre=node.val;
        inOrder(node.right);
    }
}
