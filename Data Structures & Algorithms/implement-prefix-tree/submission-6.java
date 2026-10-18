class PrefixTree {

TN root;

    public PrefixTree() {
root = new TN();         
    }

    public void insert(String word) {
TN cur = root;
for(char c : word.toCharArray()){
if(cur.nodes[c - 'a'] == null) cur.nodes[c-'a'] = new TN();
cur = cur.nodes[c-'a'];
}
cur.setEnd();
    }

    public boolean search(String word) {
    TN cur = root;
for(char c : word.toCharArray()){
    if(cur.nodes[c-'a'] == null) return false;
    cur = cur.nodes[c-'a'];
}
return cur.isEnd();
    }

    public boolean startsWith(String prefix) {
    TN cur = root;
for(char c : prefix.toCharArray()){
    if(cur.nodes[c-'a'] == null) return false;
    cur = cur.nodes[c-'a'];
}
return true;
    }
}

class TN{
    TN nodes[] = new TN[26];
    boolean end = false;

     void setEnd(){
end = true;
    }

    boolean isEnd(){
        return end;
    }
}