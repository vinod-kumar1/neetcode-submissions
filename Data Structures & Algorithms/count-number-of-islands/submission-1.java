class Solution {
    public int numIslands(char[][] grid) {
     int count = 0;
boolean[][] vis = new boolean[grid.length][grid[0].length];
        
        for(int i=0; i < grid.length; i++){
            for(int j =0; j < grid[i].length; j++){
                if(grid[i][j] == '1' && !vis[i][j]){
                    trav(grid , i , j, vis);
                    count++;
                }
            }
        }

return count;
    }

public void trav(char[][] A, int i, int j, boolean[][] vis){
    if(vis[i][j]) return;
int n = A.length, m = A[0].length;
vis[i][j] = true;

int rows[] = new int[] {-1, 0 , 1, 0};
int cols[] = new int[] {0 , -1, 0 , 1};
for(int k = 0; k < 4; k++){
    int r = rows[k] + i;
    int c = cols[k] + j;

    if(r >= 0 && r < n && c >= 0 && c < m && A[r][c] == '1' && !vis[r][c]){
        trav(A , r , c, vis);
    }
}

}

}
