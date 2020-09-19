class Solution {
    List<List<Integer>>ans=new LinkedList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
        if(nums==null||nums.length==0)
            return ans;
        Set<Integer>set=new HashSet();
        func(nums,set,new ArrayList());
        return ans;
    }

    private void func(int[] nums,Set<Integer>set,List<Integer> list){
        if(list.size()==nums.length){
            ans.add(new ArrayList(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(set.contains(i))
                continue;
            list.add(nums[i]);
            set.add(i);
            func(nums,set,list);
            list.remove(list.size()-1);
            set.remove(i);
        }
    }
}
