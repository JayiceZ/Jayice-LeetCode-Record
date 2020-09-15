class Solution {
    public int maxArea(int[] height) {
        if(height==null||height.length==0)
            return 0;
        int left=0,right=height.length-1;
        int ans=0;
        if(left>=right)
            return 0;
        while(left<right){
            ans=Math.max(ans,(right-left)*Math.min(height[left],height[right]));
            if(height[left]<height[right]){
                while(left<right&&height[left]<height[right]){
                    left++;
                    ans=Math.max(ans,(right-left)*Math.min(height[left],height[right]));

                }
            }
            else{
                while(left<right&&height[left]>=height[right]){
                    right--;
                    ans=Math.max(ans,(right-left)*Math.min(height[left],height[right]));
                }
            }
        }
        return ans;
    }
}
