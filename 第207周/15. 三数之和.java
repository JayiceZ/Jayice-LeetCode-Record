class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans=new LinkedList();
        if(nums==null||nums.length<3)
            return ans;
        for(int i=0;i<nums.length;i++){
            if(i!=0&&nums[i-1]==nums[i])
                continue;
            int left=i+1,right=nums.length-1;
            while(left<right){
                int val=nums[left]+nums[right];
                if(val==-nums[i]){
                    List<Integer>list=new ArrayList(3);
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    ans.add(list);
                    while(left<right&&nums[left+1]==nums[left]) left++;
                    while(left<right&&nums[right-1]==nums[right]) right--;
                    left++;
                    right--;
                }else if(val<-nums[i]){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return ans;
    }
}
