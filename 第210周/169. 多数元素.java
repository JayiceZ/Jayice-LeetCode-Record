class Solution {
    public int majorityElement(int[] nums) {
        int ans=0,vote=0;
        for(int num:nums){
            if(vote==0){
                ans=num;
                vote=1;
            }else{
                if(num==ans)
                    vote++;
                else
                    vote--;
            }
        }
        return ans;
    }
}