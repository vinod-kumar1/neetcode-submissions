class Solution {
    int n,m;
int[][] dirs = new int[][] {{0, -1} , {1, 0} , {0, 1}, {-1, 0}};

public void solve(char[][] board) {
    n = board.length;
    m = board[0].length;

    boolean[][] vis = new boolean[n][m];   
    
    // left and right borders
    for(int i=0; i < n; i++){
     if(board[i][0] == 'O') trav(i, 0, board , vis);
     if(board[i][m-1] == 'O') trav(i , m-1, board , vis);
    }

    // top & bottom borders
     for(int j=0; j < m; j++){
        if(board[0][j] == 'O') trav(0, j, board , vis);
        if(board[n-1][j] == 'O') trav(n-1, j, board, vis);
     }

for(int i=1; i < n-1; i++){
    for(int j=1; j < m-1; j++){
        if(board[i][j] == 'O' && !vis[i][j]) board[i][j] = 'X';
    }
}

    }

public void trav(int i, int j, char[][] A, boolean[][] vis){
if(vis[i][j]) return;

vis[i][j] = true;

for(int temp[] : dirs){
    int r = temp[0] + i, c = temp[1] + j;
    if(r >= 0 && r < n && c >= 0 && c < m && A[r][c] == 'O' && !vis[r][c]){
        trav(r,c,A,vis);
    }
}

}

}
