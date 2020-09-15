class Solution {
    private static String[] map=new String[9];
    static{
        map[0]="abc";
        map[1]="def";
        map[2]="ghi";
        map[3]="jkl";
        map[4]="mno";
        map[5]="pqrs";
        map[6]="tuv";
        map[7]="xwyz";
    }
    public List<String> letterCombinations(String digits) {
        LinkedList<String>ans=new LinkedList();
        if(digits==null||digits.length()==0)
            return ans;
        ans.add("");
        for(char c:digits.toCharArray()){
            String target=map[c-'2'];
            int size=ans.size();
            for(int i=0;i<size;i++){
                String str=ans.removeFirst();
                for(char t:target.toCharArray()){
                    ans.add(str+String.valueOf(t));
                }
            }
        }
        return ans;
    }
}
