class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>ans=new ArrayList();
        for(int num:nums){
            int index=Math.abs(num)-1;
            if(nums[index]>0){
                nums[index]*=-1;
            }
        }
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(num>0){
                ans.add(i+1);
            }
        }
        return ans;
    }
}