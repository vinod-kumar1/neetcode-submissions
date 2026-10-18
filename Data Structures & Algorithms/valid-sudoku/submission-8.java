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

for (int square = 0; square < 9; square++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;
                    if (board[row][col] == '.') continue;
                    if (seen.contains(board[row][col])) return false;
                    seen.add(board[row][col]);
                }
            }
        }

return true;
    }
}
