class Solution {
    private int k;
    public int findKthLargest(int[] nums, int k) {
        this.k=nums.length-k+1;
        return quickSelect(nums,0,nums.length-1);
    }

    private int quickSelect(int[] nums,int left,int right){
        int val=nums[left];
        int index=left-1;
        for(int i=left;i<=right;i++){
            if(nums[i]<=val){
                swap(nums,i,++index);
            }
        }
        swap(nums,left,index);
        if(index==k-1){
            return nums[index];
        }
        else if(index<k-1){
            return quickSelect(nums,index+1,right);
        }else{
            return quickSelect(nums,left,index-1);
        }
    }

    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}