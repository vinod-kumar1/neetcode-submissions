class Trie{
    char ch;
    Trie[] children;
    boolean isWord = false;

    Trie(char c){
        this.ch = c;
        this.children = new Trie[26];
    }

}


class WordDictionary {

    
    
    Trie root;

    public WordDictionary() {
        root = new Trie('*');
    }

    public void addWord(String word) {
        Trie cur = root;

        for(char c : word.toCharArray()){
            int id = c - 'a';
            if(cur.children[id] == null) cur.children[id] = new Trie(c);
            cur = cur.children[id];
        }
        cur.isWord = true;

    }

    public boolean search(String word) {

        return trav(0, word , root);

    }

    public boolean trav(int i, String s, Trie cur){

        if(i >= s.length()) return cur.isWord;


        char c = s.charAt(i);
 
        if(c == '.'){
                for(int j = 0; j < 26; j++){
                        if(cur.children[j] != null && trav(i + 1 , s , cur.children[j])) return true;
                }
        }
        else{

        if(cur.children[c - 'a'] == null) return false;
        
            return trav(i + 1, s , cur.children[c - 'a']);
        }

return false;
    }

}
