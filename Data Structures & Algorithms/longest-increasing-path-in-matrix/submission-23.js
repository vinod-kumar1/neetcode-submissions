class Solution {
    /**
     * @param {number[][]} matrix
     * @return {number}
     */
    longestIncreasingPath(matrix) {

        let rows = matrix.length;
        let cols = matrix[0].length;
        let dp = Array.from({length : rows}, () => Array(cols).fill(-1));
        let dirs = [
            [-1, 0],
            [1,0],
            [0,1] ,
            [0,-1]
        ];
    
function dfs(r,c,pv){
console.log(r,c,pv);
if(r >= rows || r < 0 || c >= cols || c < 0 || matrix[r][c] <= pv) return 0;

if(dp[r][c] != -1) return dp[r][c];

let max = 1;
for(let [i,j] of dirs){
max = Math.max(max , 1 + dfs(r + i , c + j , matrix[r][c]));
}
dp[r][c] = max;
return max;
}
let maxi = 0;

    for(let r=0; r < rows; r++){
for(let c=0; c < cols; c++){
   maxi = Math.max(maxi,  dfs(r,c,-Infinity));
}
    }
 return maxi;
    }
}
