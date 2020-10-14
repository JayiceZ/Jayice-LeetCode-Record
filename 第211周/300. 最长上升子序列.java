class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer>list=new ArrayList();
        for(int num:nums){
            int left=0,right=list.size();
            while(left<right){
                int mid=left+(right-left)/2;
                if(list.get(mid)<num){
                    left=mid+1;
                }else{
                    right=mid;
                }
            }
            if(left==list.size()){
                list.add(num);
            }else{
                list.set(left,num);
            }
        }
        return list.size();
    }
}
