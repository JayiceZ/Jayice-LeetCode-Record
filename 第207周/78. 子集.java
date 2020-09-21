class Solution {
    private List<List<Integer>> ans = new LinkedList();
    public List<List<Integer>> subsets(int[] nums) {
        ans.add(new ArrayList());
        dfs(nums,0,new ArrayList());
        return ans;
    }

    private void dfs(int[]nums,int index,List<Integer>arr){
        for(int i=index;i<nums.length;i++){
            arr.add(nums[i]);
            ans.add(new ArrayList(arr));
            dfs(nums,i+1,arr);
            arr.remove(arr.size()-1);
        }
    }
}
