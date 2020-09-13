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
    public int deepestLeavesSum(TreeNode root) {
        if(root==null)
            return 0;
        int ans=-1;
        Queue<TreeNode>queue=new LinkedList();
        queue.add(root);
        while(queue.size()!=0){
            int size=queue.size();
            int temp=0;
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                temp+=node.val;
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
            }
            ans=temp;
        }
        return ans;
    }
}
