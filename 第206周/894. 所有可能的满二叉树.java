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
    Map<Integer,List<TreeNode>>map=new HashMap();
    public List<TreeNode> allPossibleFBT(int N) {
        if(map.containsKey(N))
            return map.get(N);
        List<TreeNode>list=new ArrayList();
        if(N==1){
            list.add(new TreeNode(0));
            map.put(N,list);
            return list;
        }
        if(N%2==0)
            return list;
        for(int i=1;i<N;i+=2){
            List<TreeNode>l1=allPossibleFBT(i);
            List<TreeNode>l2=allPossibleFBT(N-i-1);
            for(TreeNode node1:l1){
                for(TreeNode node2:l2){
                    TreeNode node=new TreeNode(0);
                    node.left=node1;
                    node.right=node2;
                    list.add(node);
                }
            }
        }
        return list;
    }
}
