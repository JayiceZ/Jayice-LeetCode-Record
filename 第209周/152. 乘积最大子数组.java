class Solution {
    public int maxProduct(int[] nums) {
        int max=1,min=1,ans=nums[0];
        for(int num:nums){
            if(num<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(num,max*num);
            min=Math.min(num,min*num);
            ans=Math.max(ans,max);
        }
        return  ans;
    }
}