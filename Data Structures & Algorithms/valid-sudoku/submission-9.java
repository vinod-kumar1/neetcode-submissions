class Solution {
    public boolean isValidSudoku(char[][] board) {
        // checkAllRows
        int len = board.length;

        for(int i=0; i < len; i++){
            HashSet<Character> temp = new HashSet<>();

            for(char s : board[i]){
                if(s == '.') continue;
                if(temp.contains(s)) return false;
                temp.add(s);
            }
        }

// check All Cols

for(int i=0; i < 9; i++){
            HashSet<Character> temp = new HashSet<>();
    for(int j=0; j < 9; j++){
     char s = board[j][i];
                if(s == '.') continue;
     if(temp.contains(s)) return false;
      temp.add(s);
    }
}

// check cell

for(int i=0; i < 9; i += 3){

for(int j=0; j < 9; j += 3){

HashSet<Character> temp = new HashSet<>();

for(int k = i; k < i+3; k++){
    for(int l = j; l < j + 3; l++){
        char s = board[k][l];
                if(s == '.') continue;
                if(temp.contains(s)) return false;
                temp.add(s);
    }
}
}

}

return true;
    }
}
