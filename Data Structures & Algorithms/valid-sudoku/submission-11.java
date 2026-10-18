class Solution {
    public boolean isValidSudoku(char[][] board) {
        // check rows
int n = board.length, m = board[0].length;

        for(int i = 0; i < n; i++){
HashSet<Character> set = new HashSet<>();
for(char c : board[i]) {
    if(set.contains(c)) return false;
    if(c != '.') set.add(c);
}
        }

// check cols

for(int i = 0; i < m; i++){
HashSet<Character> set = new HashSet<>();
for(int j = 0; j < n; j++) {
    char c = board[j][i];
    if(set.contains(c)) return false;
    if(c != '.') set.add(c);
}
        }
    
    
    // check matrix

    for(int i = 0; i < n; i+=3){
        for(int j = 0; j < m; j+=3){

HashSet<Character> set = new HashSet<>();

         for(int k = i; k < i + 3; k++){

for(int  l= j; l < j + 3; l++) {
    char c = board[k][l];

    if(set.contains(c)) return false;
    if(c != '.') set.add(c);
}
        }    
        }
    }
    
    return true;
    }
}
