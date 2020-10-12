class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left=1;
        int copy[]=nums.clone();
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            nums[i]=left;
            left*=temp;
        }
        int right=1;
        for(int i=nums.length-1;i>=0;i--){
            nums[i]*=right;
            right*=copy[i];
        }
        return nums;
    }
}