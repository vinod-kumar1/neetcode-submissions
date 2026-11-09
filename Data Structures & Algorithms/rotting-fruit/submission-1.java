class Solution {
    public int orangesRotting(int[][] grid) {
        int ff = 0;
        Deque<int[]> dq= new ArrayDeque<>();
int[][] dir = new int[][] {{-1, 0 } , { 0 , -1} , {1 , 0} , {0 , 1}};
int max = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 2) dq.addLast(new int[] {i , j , 0});
                if(grid[i][j] == 1) ff++;
            }
        }

while(!dq.isEmpty()){
    int[] item = dq.removeFirst();
    
for(int temp[] : dir){
    int r = temp[0] + item[0];
    int c = temp[1] + item[1];

    if(r >= 0 && r < grid.length && c >= 0 && c < grid[0].length && grid[r][c] == 1){
        dq.addLast(new int[] {r , c, 1 + item[2]});
        grid[r][c] = 2;
        max = Math.max(max , 1 + item[2]);
        ff--;
    }
}

}

    
    if(ff > 0) return -1;

    return max;
    }
}
