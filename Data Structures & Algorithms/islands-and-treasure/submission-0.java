class Solution {
    int n, m ;
    int T = 2147483647;

    public void islandsAndTreasure(int[][] grid) {
        n = grid.length;
        m = grid[0].length;

        for(int i=0; i < n; i++){
            for(int j =0; j < m; j++){
                if(grid[i][j] == 0){
                    trav(grid, i , j);
                }
            }
        }
    }

    public void trav(int[][] A, int i, int j){
        boolean[][]vis = new boolean[n][m];

        Deque<int[]> dq = new ArrayDeque<>();
        dq.add(new int[] { i , j , 0});

        while(!dq.isEmpty()){
            int[] temp = dq.removeFirst();
            int s1 = temp[0], s2 = temp[1], cost = temp[2];

            if(vis[s1][s2]) continue; 
            vis[s1][s2] = true;

            int rows[] = new int[] {-1, 0 , 1, 0};
            int cols[] = new int[] {0, -1, 0, 1};

            for(int k=0; k < 4; k++){
                int r = rows[k] + s1;
                int c = cols[k] + s2;

                if(r >= 0 && r < n && c >= 0 && c < m && !vis[r][c] && A[r][c] != -1 && A[r][c] != 0){
                    dq.add(new int[] {r , c, cost + 1});
                    A[r][c] = Math.min(A[r][c] , cost + 1);
                }
            }
        }

    }

}
