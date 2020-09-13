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
    int m,n;
    public List<List<String>> printTree(TreeNode root) {
        this.m=depth(root);
        this.n=(int)Math.pow(2,m)-1;
        List<List<String>>ans=new ArrayList();
        String[][] arr=new String[m][n];
        func(root,1,arr,0,n-1);
        for(int i=0;i<m;i++){
            List<String>temp=new ArrayList();
            for(int j=0;j<n;j++){
                temp.add(arr[i][j]==null?"":arr[i][j]);
            }
            ans.add(temp);
        }
        return ans;
    }

    private void func(TreeNode node,int depth,String[][]arr,int left,int right){
        if(node==null||left>right)
            return;
        int mid=left+(right-left)/2;
        arr[depth-1][mid]=node.val+"";
        func(node.left,depth+1,arr,left,mid-1);
        func(node.right,depth+1,arr,mid+1,right);
    }
    private int depth(TreeNode node){
        if(node==null)
            return 0;
        return Math.max(depth(node.left),depth(node.right))+1;
    }
}
