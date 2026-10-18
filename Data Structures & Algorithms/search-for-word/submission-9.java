class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0; i < board.length; i++){
            for(int j =0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(0) && trav(board , word , i , j, new boolean[board.length][board[0].length] , 1)) return true;
            }
        }

return false;
    }

public boolean trav(char[][] A, String word , int i, int j, boolean map[][], int idx){
int n = A.length, m = A[0].length;
if(idx >= word.length()) return true;

if( i >= n || j >= m || map[i][j]) return false;

map[i][j] = true;

int rows[] = new int[] {-1, 0 , 1, 0};
int cols[] = new int[] {0 , -1, 0 , 1};
char c = word.charAt(idx);

for(int k=0; k < 4; k++){
int row = rows[k] + i;
int col = cols[k] + j;

if(row >= 0 && row < n && col >= 0 && col < m && !map[row][col] && A[row][col] == c){
  if(trav(A , word , row, col, map, idx+1)) return true;
}

}
map[i][j] = false;

return false;
}

}
