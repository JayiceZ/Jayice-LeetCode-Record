class Solution {
    public int coinChange(int[] coins, int amount) {
        Set<Integer>set=new HashSet();
        for(int num:coins){
            set.add(num);
        }
        int[]dp=new int[amount+1];
        for(int i=1;i<=amount;i++){
            if(set.contains(i)){
                dp[i]=1;
            }else{
                dp[i]=Integer.MAX_VALUE;
                for(int val:coins){
                    if(i-val<0||dp[i-val]==-1)
                        continue;
                    dp[i]=Math.min(dp[i],dp[i-val]+1);
                }
                if(dp[i]==Integer.MAX_VALUE){
                    dp[i]=-1;
                }
            }
        }
        return dp[amount];
    }
}