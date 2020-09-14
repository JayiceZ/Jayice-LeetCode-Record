class Solution {
    public String longestPalindrome(String s) {
        if(s==null||s.length()==0)
            return "";
        int[]dp=new int[s.length()];
        int ans=0;
        int left=0,right=0;
        for(int i=0;i<s.length();i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j)&&dp[j+1]==1){
                    if(ans<i-j+1){
                        ans=i-j+1;
                        left=j;
                        right=i;
                    }
                    dp[j]=1;
                }else{
                    dp[j]=0;
                }
            }
        }
        return s.substring(left,right+1);
    }
}
