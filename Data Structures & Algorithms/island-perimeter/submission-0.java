class Solution {
int[] rows = new int[] {-1, 0 , 1, 0};
int[] cols = new int[] {0, -1 , 0, 1};
int n,m;

    public int islandPerimeter(int[][] grid) {
n = grid.length;
m = grid[0].length;

      for(int i = 0; i < grid.length; i++){
        for(int j = 0; j < grid[0].length; j++){
            if(grid[i][j] == 1){
                int[] res = new int[] {0};
                trav(grid , i , j, res, new boolean[grid.length][grid[0].length]);
                return res[0];
            }
        }
      }
    return 0;
    }

public void trav(int[][] A, int r, int c, int res[], boolean[][] dp){
if(dp[r][c]) return;

dp[r][c] = true;

for(int i = 0; i < 4; i++){

    int row = rows[i] + r;
    int col = cols[i] + c;

if(row < 0 || row >= n || col < 0 || col >= m || A[row][col] == 0) res[0]++;

if(row >= 0 && row < n && col >= 0 && col < m && !dp[row][col] && A[row][col] == 1){
trav(A , row , col , res , dp);
}

}

}

}