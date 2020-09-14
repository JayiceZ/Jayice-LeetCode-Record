class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null)
            return 0;
        int[] dict=new int[128];
        int left=0,right=0;
        int max=0;
        while(right<s.length()){
            int val=++dict[s.charAt(right)-0];
            if(val==1){
                max=Math.max(max,right-left+1);
            }else{
                while(dict[s.charAt(right)-0]>1){
                    dict[s.charAt(left++)-0]--;
                }
            }
            right++;
        }
        return max;
    }
}
