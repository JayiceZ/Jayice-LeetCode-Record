在二叉树中，根节点位于深度 0 处，每个深度为 k 的节点的子节点位于深度 k+1 处。

如果二叉树的两个节点深度相同，但父节点不同，则它们是一对堂兄弟节点。

我们给出了具有唯一值的二叉树的根节点 root，以及树中两个不同节点的值 x 和 y。

只有与值 x 和 y 对应的节点是堂兄弟节点时，才返回 true。否则，返回 false。

 

示例 1：


输入：root = [1,2,3,4], x = 4, y = 3
输出：false
示例 2：


输入：root = [1,2,3,null,4,null,5], x = 5, y = 4
输出：true
示例 3：



输入：root = [1,2,3,null,4], x = 2, y = 3
输出：false

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/cousins-in-binary-tree
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode>queue=new LinkedList();
        queue.add(root);
        int count=0;
        while(queue.size()!=0){
            int size=queue.size();
            for(int i=0;i<size;i++){
                int begin=count;
                TreeNode node=queue.poll();
                if(node.left!=null){
                    queue.add(node.left);
                    if(node.left.val==x||node.left.val==y){
                        count++;
                    }
                }
                if(node.right!=null){
                    queue.add(node.right);
                    if(node.right.val==x||node.right.val==y){
                        count++;
                    }
                }
                if(begin==count-2){
                    return false;
                }
            }
            if(count==1){
                return false;
            }else if(count==2){
                return  true;
            }
        }
        return true;
    }
}
