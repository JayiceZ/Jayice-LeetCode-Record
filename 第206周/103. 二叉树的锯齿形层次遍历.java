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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList();
        if(root==null)
            return ans;
        Queue<TreeNode>queue=new LinkedList();
        queue.add(root);
        boolean forwardRight=true;
        while(queue.size()!=0){
            int size=queue.size();
            LinkedList<Integer>list=new LinkedList();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
                if(forwardRight){
                    list.add(node.val);
                }else{
                    list.addFirst(node.val);
                }
            }
            forwardRight=forwardRight?false:true;
            ans.add(list);
        }
        return ans;
    }
}
