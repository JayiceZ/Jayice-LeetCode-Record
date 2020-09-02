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
    int pre=0,maxTime=0,nowTime=0;
    List<Integer>list=new ArrayList();
    public int[] findMode(TreeNode root) {
        inOrder(root);
        int[]ans=new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
    private void inOrder(TreeNode root){
        if(root==null)
            return;
        inOrder(root.left);
        if(pre==root.val)
            nowTime++;
        else{
            pre=root.val;
            nowTime=1;
        }
        if(nowTime==maxTime)
            list.add(root.val);
        else if(nowTime>maxTime){
            list.clear();
            list.add(root.val);
            maxTime=nowTime;
        }
        inOrder(root.right);
    }
}
