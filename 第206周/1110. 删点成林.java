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
    List<TreeNode>ans=new LinkedList();
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        for(int i:to_delete)
            set.add(i);
        TreeNode node=func(root);
        if(node!=null)
            ans.add(node);
        return ans;
    }

    private TreeNode func(TreeNode node){
        if(node==null)
            return null;
        TreeNode left=func(node.left);
        TreeNode right=func(node.right);
        if(set.contains(node.val)){
            if(left!=null){
                ans.add(left);
            }
            if(right!=null){
                ans.add(right);
            }
            return null;
        }
        node.left=left;
        node.right=right;
        return node;
    }
}
