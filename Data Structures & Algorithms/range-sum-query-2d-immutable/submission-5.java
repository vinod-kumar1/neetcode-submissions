class NumMatrix {
int n,m;
int[][] pf;

    public NumMatrix(int[][] matrix) {
         n = matrix.length;
         m = matrix[0].length;

         pf = new int[n][m];
    
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
             if(j > 0) pf[i][j] = matrix[i][j] + pf[i][j - 1];
             else pf[i][j] = matrix[i][j];
        
        if(i > 0) pf[i][j] += pf[i-1][j];
        if(i > 0 && j > 0) pf[i][j] -= pf[i-1][j-1];
        }
    }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = pf[row2][col2];

        if(row1 > 0) sum -= pf[row1 - 1][col2];
        
        if(col1 > 0){
            sum -= pf[row2][col1 - 1];
        }

if(row1 > 0 && col1 > 0){
    sum += pf[row1 - 1][col1 - 1];
}

return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */