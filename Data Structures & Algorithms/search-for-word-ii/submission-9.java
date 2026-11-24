class Trie{
    String word;
    int idx = -1;
    Trie[] nodes = new Trie[26];

public void addWord(String s, int n){
    Trie cur = this;

    for(char c : s.toCharArray()){
        if(cur.nodes[c - 'a'] == null) cur.nodes[c - 'a'] = new Trie();
        cur = cur.nodes[c - 'a'];
    }
    cur.word = s;
    cur.idx = n;
}

}


class Solution {

    int[][] dir = new int[][] {{-1 , 0} , {0 , -1} , {1 , 0} , {0 , 1}};
int n,m;

    public List<String> findWords(char[][] board, String[] words) {
Trie root = new Trie();
n = board.length;
m = board[0].length;

for(int i =0; i < words.length; i++) root.addWord(words[i] , i);

ArrayList<String> res = new ArrayList<>();

for(int i = 0; i < n; i++){
    for(int j = 0; j < m; j++) trav(i , j , root , res , board);
}

return res;

    }

public void trav(int i , int j , Trie cur , ArrayList<String> res, char[][] A){
    if( i < 0 || i >= n || j < 0 || j >= m || A[i][j] == '#') return;

char c = A[i][j];
if(cur.nodes[c - 'a'] == null) return;

if(cur.nodes[c - 'a'].word != null){
    res.add(cur.nodes[c - 'a'].word);
    cur.nodes[c - 'a'].word = null;
}
    A[i][j] = '#';

for(int[] temp : dir){
trav(i + temp[0] , j + temp[1] , cur.nodes[c - 'a'] , res , A);
}

    A[i][j] = c;

}

}
