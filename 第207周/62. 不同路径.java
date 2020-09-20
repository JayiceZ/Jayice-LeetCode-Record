class Solution {
    public int uniquePaths(int m, int n) {
        if(m==0||n==0)
            return 0;
         int[]dp=new int[n+1];
         dp[1]=1;
         for(int j=0;j<m;j++){
            for(int i=1;i<=n;i++){
                dp[i]=dp[i]+dp[i-1];
            }
         }
         return dp[n];
    }
}
