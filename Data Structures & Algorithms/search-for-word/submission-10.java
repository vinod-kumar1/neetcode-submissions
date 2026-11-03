class Solution {
    int rows[] = new int[] {-1, 0 , 1, 0};
    int cols[] = new int[] {0, -1 , 0, 1};
int n,m;

    public boolean exist(char[][] board, String word) {
       n = board.length;
       m = board[0].length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
if(board[i][j] == word.charAt(0) && trav(board , word , i , j, 1, new boolean[n][m])) return true;
            }
        }

return false;
    }


public boolean trav(char[][] A, String s, int i, int j, int idx, boolean[][] dp){
    if(idx >= s.length()) return true;

dp[i][j] = true;

for(int k = 0; k < 4; k++){
    int r = rows[k] + i , c = cols[k] + j;

if(r >= 0 && r < n && c >= 0 && c < m && !dp[r][c]){
if(A[r][c] == s.charAt(idx) && trav(A , s , r , c, idx + 1, dp)) return true;
}

}

dp[i][j] = false;

return false;
}

}
