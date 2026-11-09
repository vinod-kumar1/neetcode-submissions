class Solution {
    int n, m;
    int[] rows = new int[]{-1, 0, 1, 0};
    int[] cols = new int[]{0, -1, 0, 1};
    int INF = 2147483647;

    public void islandsAndTreasure(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
Deque<int[]> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) dq.addLast(new int[] {i , j , 0});
            }
        }

                    

                    while (!dq.isEmpty()) {
                        int ii = dq.peekFirst()[0];
                        int jj = dq.removeFirst()[1];

                
                        for (int k = 0; k < 4; k++) {
                            int r = rows[k] + ii;
                            int c = cols[k] + jj;

                if (r >= 0 && r < n && c >= 0 && c < m && grid[r][c] == INF) {
                                dq.addLast(new int[]{r, c});
                                grid[r][c] = grid[ii][jj] + 1;
                            }

                        }

                    }

    }

}
