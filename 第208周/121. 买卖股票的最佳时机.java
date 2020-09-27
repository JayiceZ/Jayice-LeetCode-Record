class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length==0)
            return 0;
        int min=prices[0];
        int ans=0;
        for(int num:prices){
            ans=Math.max(ans,num-min);
            min=Math.min(min,num);
        }
        return ans;
    }
}
