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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>ans=new LinkedList();
        Stack<TreeNode>stack=new Stack();
        while(root!=null||stack.size()!=0){
            if(root!=null){
                stack.push(root);
                root=root.left;
            }else{
                root=stack.pop();
                ans.add(root.val);
                root=root.right;
            }
        }
        return ans;
    }
}
