class Solution {
    public void nextPermutation(int[] nums) {
        int i;
        for(i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1])
                break;
        }
        if(i==0){
            Arrays.sort(nums);
            return;
        }
        int left=nums[i-1];
        int j;
        for(j=nums.length-1;j>=i;j--){
            if(nums[j]>left)
                break;
        }
        int temp=nums[j];
        nums[j]=nums[i-1];
        nums[i-1]=temp;
        Arrays.sort(nums,i,nums.length);
    }
}
