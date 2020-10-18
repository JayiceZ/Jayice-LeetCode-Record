class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] dict=new int[26];
        for(char c:tasks){
            dict[c-'A']++;
        }
        int ans=0;
        Arrays.sort(dict);
        while(dict[25]>0){
            for(int i=0;i<=n;i++){
                if(25-i>=0&&dict[25-i]>0){
                    dict[25-i]--;
                }
                ans++;
                if(dict[25]==0){
                    break;
                }
            }
            Arrays.sort(dict);
        }
        return ans;
    }
}