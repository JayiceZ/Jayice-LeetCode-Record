class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==0)
            return -1;
        int left=0,right=nums.length-1,index=0;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[mid+1]){
                index=mid+1;
                break;
            }
            if(nums[mid]>nums[right])
                left=mid+1;
            else
                right=mid;
        }
        int ans;
        if((ans=getAns(nums,0,index-1,target))!=-1)
            return ans;
        return getAns(nums,index,nums.length-1,target);
    }

    private int getAns(int[]nums,int left,int right,int target){
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
                left=mid+1;
            else    
                right=mid;
        }
        return nums[left]==target?left:-1;
    }
}
