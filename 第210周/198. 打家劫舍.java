class Solution {
    public int rob(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;
        for(int i=1;i<nums.length;i++){
            int lastOne=nums[i-1];
            int lastTwo=(i==1?0:nums[i-2])+nums[i];
            nums[i]=Math.max(lastOne,lastTwo);
        }
        return nums[nums.length-1];
    }
}