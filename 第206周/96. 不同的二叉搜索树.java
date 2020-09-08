class Solution {
    public int numTrees(int n) {
        int[]dp=new int[n+1];
        dp[0]=1;
        for(int i=1;i<n+1;i++){
            for(int j=0;j<i/2;j++){
                dp[i]+=2*dp[j]*dp[i-1-j];
            }
            if(i%2==1)
                dp[i]+=dp[i/2]*dp[i/2];
        }
        return dp[n];
    }
}
