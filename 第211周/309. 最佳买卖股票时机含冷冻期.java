class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0)
            return 0;

        int[][] dp=new int[prices.length][3];
        int i=-prices[0],j=0,k=0;
        for(int n=1;n<prices.length;n++){
            int newI=Math.max(i,k-prices[n]);
            int newJ=i+prices[n];
            int newK=Math.max(j,k);
            i=newI;
            j=newJ;
            k=newK;
        }
        return Math.max(j,k);
    }
}