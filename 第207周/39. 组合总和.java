class Solution {
    List<List<Integer>> ans=new LinkedList();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates==null||candidates.length==0)
            return ans;
        dfs(candidates,0,0,target,new ArrayList());
        return ans;
    }

    private void dfs(int[] candidates,int index,int sum,int target,List<Integer>list){
        if(sum==target){
            ans.add(new ArrayList(list));
            return;
        }else if(sum>target){
            return;
        }
        for(int i=index;i<candidates.length;i++){
            list.add(candidates[i]);
            dfs(candidates,i,sum+candidates[i],target,list);
            list.remove(list.size()-1);
        }
    }
}
