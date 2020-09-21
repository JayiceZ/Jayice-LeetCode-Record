class Solution {
    public void sortColors(int[] nums) {
        int left=0,right=nums.length-1,search=0;
        while(search<=right){
            if(nums[search]==0)
                change(nums,left++,search++);
            else if(nums[search]==2)
                change(nums,right--,search);
            else
                search++;
        }
    }

    private void change(int[]nums,int left,int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
}
