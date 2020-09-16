class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums==null||nums.length==0)
            return new int[]{-1,-1};
        int[]ans=new int[2];
        int left=0,right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]>=target)
                right=mid;
            else
                left=mid+1;
        }
        if(nums[left]==target)
            ans[0]=left;
        else{
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }

        left=0;right=nums.length;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]<=target)
                left=mid+1;
            else
                right=mid;
        }
        ans[1]=left-1;
        return ans;
    }
}
