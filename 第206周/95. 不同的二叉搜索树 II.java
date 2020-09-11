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
    public List<TreeNode> generateTrees(int n) {
        if(n<1)
            return new ArrayList();
        return func(1,n);
    }
    private List<TreeNode> func(int start,int end){
        List<TreeNode>ans=new ArrayList();
        if(start>end){
            ans.add(null);
            return ans;
        }
        for(int i=start;i<=end;i++){
            List<TreeNode>leftList=func(start,i-1);
            List<TreeNode>rightList=func(i+1,end);
            for(TreeNode left:leftList){
                for(TreeNode right:rightList){
                    TreeNode node=new TreeNode(i);
                    node.left=left;
                    node.right=right;
                    ans.add(node);
                }
            }
        }
        return ans;
    }
}
