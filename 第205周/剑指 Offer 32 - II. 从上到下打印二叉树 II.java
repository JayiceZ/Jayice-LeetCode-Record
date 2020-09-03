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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode>queue=new LinkedList();
        List<List<Integer>>ans=new ArrayList();
        if(root==null)
            return ans;
        queue.add(root);
        List<Integer>list=new ArrayList();
        while(queue.size()!=0){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                list.add(node.val);
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
            }
            ans.add(new ArrayList(list));
            list.clear();
        }
        return ans;
    }
}
