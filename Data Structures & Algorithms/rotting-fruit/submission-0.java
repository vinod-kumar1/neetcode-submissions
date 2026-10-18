class Solution {
    int n,m;

    public int orangesRotting(int[][] grid) {
    n = grid.length;
    m = grid[0].length;
int ff = 0;
Deque<int[]> dq = new ArrayDeque<>();

        for(int i =0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 2) dq.addFirst(new int[] {i , j , 0});
                if(grid[i][j] == 1) ff++;
            }
        }

int time = 0;

while(!dq.isEmpty()){
int[] temp = dq.removeFirst();
int i = temp[0], j = temp[1], tt = temp[2];

int rows[] = new int[] {-1, 0, 1, 0};
int cols[] = new int[] {0, -1, 0, 1};

for(int k=0; k < 4; k++){
    int r = rows[k] + i;
    int c = cols[k] + j;

if(r >= 0 && r < n && c >= 0 && c < m && grid[r][c] == 1){
dq.addLast(new int[] {r, c , tt + 1});
grid[r][c] = 2;
time = Math.max(time , tt + 1);
ff--;
}
}

}

return ff <= 0 ? time : -1;
    }
}
