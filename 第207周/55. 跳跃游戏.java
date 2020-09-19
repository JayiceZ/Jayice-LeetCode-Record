class Solution {
    public boolean canJump(int[] nums) {
        int target=nums.length-1;
        int max=0;
        for(int i=0;i<nums.length-1;i++){
            if(i>max)
                return false;
            int val=nums[i];
            max=Math.max(max,i+nums[i]);
            if(max>=target)
                return true;
        }
        return max>=target;
    }
}
