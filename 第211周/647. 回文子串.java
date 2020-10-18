class Solution {
    public int countSubstrings(String s) {
        int ans=0;
        int[] dp=new int[s.length()];
        for(int i=0;i<s.length();i++){
            ans++;
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(s.charAt(j)==s.charAt(i)&&dp[j+1]==1){
                    dp[j]=1;
                    ans++;
                }else{
                    dp[j]=0;
                }
            }
        }
        return ans;
    }
}