class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap();
        for(String s:strs){
            int[]dict=new int[26];
            for(char c:s.toCharArray())
                dict[c-'a']++;
            String key=Arrays.toString(dict);
            List<String>list=map.get(key);
            if(list==null){
                list=new LinkedList();
                map.put(key,list);
            }
            list.add(s);
        }
        List<List<String>>ans=new LinkedList();
        for(Map.Entry<String,List<String>> entry:map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}
