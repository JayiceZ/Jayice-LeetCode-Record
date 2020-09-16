class Solution {
    List<String>ans=new ArrayList();
    public List<String> generateParenthesis(int n) {
        func("",0,0,n);
        return ans;
    }

    private void func(String s,int l,int r,int count){
        if(s.length()==2*count){
            ans.add(s);
            return;
        }
        if(l<count)
            func(s+"(",l+1,r,count);
        if(l>r)
            func(s+")",l,r+1,count);
    }
}
