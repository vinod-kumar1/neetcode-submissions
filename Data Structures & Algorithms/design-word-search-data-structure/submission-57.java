class WordDictionary {
TN root;

    public WordDictionary() {
root = new TN();
    }

    public void addWord(String word) {
TN cur = root;

for(char c : word.toCharArray()){
if(cur.nodes[c-'a'] == null) cur.nodes[c-'a'] = new TN();
cur = cur.nodes[c-'a'];
}
cur.isEnd = true;
    }

public boolean dfs(String s, TN cur,  int i ){
if(i >= s.length()) return cur.isEnd;
char c = s.charAt(i);
if(c == '.'){
for(TN node : cur.nodes){
if(node != null && dfs(s , node , i+1)) return true;
}
return false;
}
else{
    if(cur.nodes[c-'a'] == null) return false;
   return dfs(s , cur.nodes[c-'a'] , i+1);
}
}

    public boolean search(String word) {
    return dfs(word , root , 0);
    }

}

class TN{
    TN nodes[] = new TN[26];
boolean isEnd = false;
}