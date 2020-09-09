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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList();
        Stack<TreeNode>stack=new Stack();
        if(root==null)
            return ans;
        stack.add(root);
        while(stack.size()!=0){
            TreeNode node=stack.pop();
            ans.add(node.val);
            if(node.right!=null)
                stack.add(node.right);
            if(node.left!=null)
                stack.add(node.left);
        }
        return ans;
    }
}
