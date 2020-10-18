class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        boolean flag=false;
        for(int i=1;i<nums.length;i++){
            if(!flag&&nums[i]<nums[i-1]){
                flag=true;
            }
            if(flag){
                min=Math.min(min,nums[i]);
            }
        }
        flag=false;
        for(int i=nums.length-2;i>=0;i--){
            if(!flag&&nums[i]>nums[i+1]){
                flag=true;
            }
            if(flag){
                max=Math.max(max,nums[i]);
            }
        }
        int l=0;
        for(;l<nums.length;l++){
            if(min<nums[l]){
                break;
            }
        }
        int r=nums.length-1;
        for(;r>=0;r--){
            if(max>nums[r]){
                break;
            }
        }
        return r==-1?0:r-l+1;
    }
}