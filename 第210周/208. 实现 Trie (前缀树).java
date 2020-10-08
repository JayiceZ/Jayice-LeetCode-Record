class Trie {

    Trie[] dict;
    boolean end;

    /** Initialize your data structure here. */
    public Trie() {
        dict=new Trie[26];
        end=false;
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie t=this;
        for(char c:word.toCharArray()){
            if(t.dict[c-'a']==null){
                t.dict[c-'a']=new Trie();
            }
            t=t.dict[c-'a'];
        }
        t.end=true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie t=this;
        for(char c:word.toCharArray()){
            if(t.dict[c-'a']==null){
                return false;
            }
            t=t.dict[c-'a'];
        }
        return t.end;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie t=this;
        for(char c:prefix.toCharArray()){
            if(t.dict[c-'a']==null){
                return false;
            }
            t=t.dict[c-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */