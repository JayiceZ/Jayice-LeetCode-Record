给定一个二叉树，返回所有从根节点到叶子节点的路径。

说明: 叶子节点是指没有子节点的节点。

示例:

输入:

   1
 /   \
2     3
 \
  5

输出: ["1->2->5", "1->3"]

解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/binary-tree-paths
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        StringBuilder s1=new StringBuilder(),s2=new StringBuilder();
        preOrder(root1,s1);
        preOrder(root2,s2);
        return s1.toString().equals(s2.toString());
    }
    private void preOrder(TreeNode root,StringBuilder sb){
        if(root==null)
            return;
        if(root.left==null&&root.right==null){
            sb.append(root.val).append(",");
            return;
        }
        preOrder(root.left,sb);
        preOrder(root.right,sb);
    }
}
