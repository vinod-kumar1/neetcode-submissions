class Solution {
    int n,m;

    public int maxAreaOfIsland(int[][] grid) {
    n = grid.length;
    m = grid[0].length;
int max = 0;

        boolean[][] vis = new boolean[n][m];
        for(int i=0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1 && !vis[i][j]) max = Math.max(max , 1 + trav(grid, i , j, vis));
            }
        }

return max;
    }

public int trav(int[][] A, int i, int j , boolean[][] vis){
if(vis[i][j]) return 0;

vis[i][j] = true;

int rows[] = new int[] {-1 , 0 , 1, 0};
int cols[] = new int[] {0, -1, 0, 1};
int sum = 0;

for(int k =0 ; k < 4; k++){
    int r = rows[k] + i;
    int c = cols[k] + j;

if(r >= 0 && r < n && c >= 0 && c < m && A[r][c] == 1 && !vis[r][c]){
 sum = sum + (1 + trav(A , r , c, vis));
}

}

return sum;
}

}
