class Solution {
    public boolean exist(char[][] board, String word) {
        int[][] vis = new int[board.length][board[0].length];
        for(int[] temp : vis) Arrays.fill(temp , 0);

        for(int i=0; i < board.length; i++){
            for(int j=0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(0)) {
                  vis[i][j] = 1;
                   if(trav(board , word , i, j, 1, vis)) return true;
                vis[i][j] = 0;
                }
            }
        }

return false;
    }

public boolean trav(char[][] A, String word , int i, int j, int cur, int[][] vis){
    if( cur >= word.length()) return true;

    int rows[] = new int[] { -1, 0 , 1 , 0};
    int cols[] = new int[] { 0 , -1 , 0 , 1};

for(int k = 0; k < 4; k++){
    int row = rows[k] + i;
    int col = cols[k] + j;

if(row >= 0 && row < A.length && col >= 0 && col < A[0].length && A[row][col] == word.charAt(cur)){
if(vis[row][col] != 0) continue;
vis[row][col] = 1;
if(trav(A , word , row , col , cur + 1, vis)) return true;
vis[row][col] = 0;
}
}

return false;
}

}
