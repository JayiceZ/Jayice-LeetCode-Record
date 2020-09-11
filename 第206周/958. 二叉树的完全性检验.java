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
    public boolean isCompleteTree(TreeNode root) {
        if(root==null)
            return true;
        Queue<TreeNode>queue=new LinkedList();
        boolean ans=true;
        queue.add(root);
        while(queue.size()!=0){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if(node.left!=null){
                    if(!ans)
                        return ans;
                    queue.add(node.left);
                }else{
                    ans=false;
                }
                if(node.right!=null){
                    if(!ans)
                        return ans;
                    queue.add(node.right);
                }else{
                    ans=false;
                }
            }
        }
        return true;
    }
}
