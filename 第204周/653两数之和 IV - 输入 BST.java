给定一个二叉搜索树和一个目标结果，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。

案例 1:

输入: 
    5
   / \
  3   6
 / \   \
2   4   7

Target = 9

输出: True
 

案例 2:

输入: 
    5
   / \
  3   6
 / \   \
2   4   7

Target = 28

输出: False

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/two-sum-iv-input-is-a-bst
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。v

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
    Set<Integer>set=new HashSet();
    public boolean findTarget(TreeNode root, int k) {        
        return inOrder(root,k);
    }
    private boolean inOrder(TreeNode node,int k){
        if(node==null){
            return false;
        }
        boolean left=inOrder(node.left,k);
        if(left){
            return true;
        }

        if(set.contains(k-node.val)){
            return true;
        }
        set.add(node.val);

        boolean right = inOrder(node.right,k);
        if(right){
            return true;
        }
        return false;
    }
}
