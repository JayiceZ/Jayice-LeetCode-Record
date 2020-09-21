class Solution {
    public int climbStairs(int n) {
        if(n<=0)
            return 0;
        int lastOne=1,lastTwo=0;
        int ans=0;
        for(int i=1;i<=n;i++){
            ans=lastOne+lastTwo;
            lastTwo=lastOne;
            lastOne=ans;
        }
        return ans;
    }
}
