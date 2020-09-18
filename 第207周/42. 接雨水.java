class Solution {
    public int trap(int[] height) {
        if(height==null||height.length==0)
            return 0;
        int left=0,right=height.length-1;
        int ans=0;
        while(left<right&&height[left+1]>=height[left]) left++;
        while(left<right&&height[right-1]>=height[right]) right--;
        while(left<right){
            if(height[left]<height[right]){
                int val=height[left];
                left++;
                while(left<right&height[left]<=val){
                    ans+=(val-height[left++]);
                }
            }else{
                int val=height[right];
                right--;
                while(left<right&height[right]<=val){
                    ans+=(val-height[right--]);
                }
            }
        }
        return ans;
    }
}
