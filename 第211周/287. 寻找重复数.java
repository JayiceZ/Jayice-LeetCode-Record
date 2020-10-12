class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int val=Math.abs(nums[i]);
            int targetVal=nums[val];
            if(targetVal<0){
                return val;
            }else{
                nums[val]*=-1;
            }
        }
        return -1;
    }
}