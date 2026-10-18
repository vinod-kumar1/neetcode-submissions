class Solution {
    int n,m;
    int dirs[][] = new int[][] {{0,-1} , {1, 0}, {0, 1}, {-1, 0}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
      n = heights.length;
      m = heights[0].length;
boolean ao[][] = new boolean[n][m];
boolean po[][] = new boolean[n][m];

      // whether I can reach left & right borders
      for(int i=0; i < n; i++){
        dfs(i , 0 , po, heights, heights[i][0]);
        dfs(i, m-1 , ao, heights,  heights[i][m-1]);
      }

      // whether I can creach top & bottom borders
      for(int j = 0; j < m ; j++){
        dfs(0 , j , po, heights, heights[0][j]);
        dfs(n-1 , j , ao, heights, heights[n-1][j]);
      }

List<List<Integer>> res = new ArrayList<>();

for(int i=0; i < n ; i++){
    for(int j=0; j < m; j++){
        if(po[i][j] && ao[i][j]){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(i);
            temp.add(j);
            res.add(temp);
        }
    }
}

return res;
    }

public void dfs(int r, int c, boolean[][] ocean, int[][] A, int prevHeight){
    if( r < 0 || r >= n || c < 0 || c >= m || ocean[r][c] || A[r][c] < prevHeight) return;

ocean[r][c] = true;

for(int i=0; i < 4; i++) dfs(dirs[i][0] + r , dirs[i][1] + c, ocean, A,  A[r][c]);

}

}
