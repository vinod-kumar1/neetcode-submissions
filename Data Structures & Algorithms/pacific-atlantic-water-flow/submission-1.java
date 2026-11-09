class Solution {
 int[][] dir = new int[][] {{-1, 0} , {0 , -1} , {1 , 0} , {0 , 1}};
int n,m;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
n = heights.length;
m = heights[0].length;
List<List<Integer>> res = new ArrayList<>();

boolean[][] ao = new boolean[n][m];
boolean[][] po = new boolean[n][m];

for(int i = 0 ; i < n; i++){
dfs(heights, i , 0 , po , heights[i][0]);    
dfs(heights, i , m-1 , ao , heights[i][m-1]);    
}

for(int i = 0; i < m; i++){
    dfs(heights , 0 , i , po , heights[0][i]);
    dfs(heights , n - 1 , i , ao , heights[n - 1][i]);
}

for(int i = 0; i < n; i++){
    for(int j = 0; j < m; j++){
        if(ao[i][j] && po[i][j]) res.add(new ArrayList<>(List.of(i , j)));
    }
}
return res;
    }

public void dfs(int[][] A, int i , int j , boolean[][] oc , int ph){
    if(oc[i][j] || A[i][j] < ph) return;

    oc[i][j] = true;

    for(int[] temp : dir){
        int r = temp[0] + i, c = temp[1] + j;
        if(r >= 0 && r < n && c >= 0 && c < m) dfs(A , r , c, oc , A[i][j]);
    }

}

}
