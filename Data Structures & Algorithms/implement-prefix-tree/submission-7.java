class Trie{
char ch;
boolean isEnd = false;
Trie tr[];

Trie(char c){
    this.tr = new Trie[26];
    this.ch =c; 
}

}

class PrefixTree {

Trie root;

    public PrefixTree() {
root = new Trie('.');
    }

    public void insert(String word) {
Trie cur = root;

for(int i = 0; i < word.length(); i++){
    char c = word.charAt(i);

int id = (int) (c - 'a');
if(cur.tr[id] == null) cur.tr[id] = new Trie(c);

cur.ch = c;
if(i == word.length() - 1) cur.isEnd = true;

cur = cur.tr[id];

}
    }

    public boolean search(String word) {
Trie cur = root;

for(int i = 0; i < word.length(); i++){
    char c = word.charAt(i);

    int id = c - 'a';
    if(cur.tr[id] == null) return false;
    if(i == word.length() - 1) return cur.isEnd;

    cur = cur.tr[id];
}

return false;
    }

    public boolean startsWith(String prefix) {
Trie cur = root;

for(int i = 0; i < prefix.length(); i++){
    char c = prefix.charAt(i);

    int id = c - 'a';
    if(cur.tr[id] == null) return false;
    cur = cur.tr[id];
}

return true;
    }
}
