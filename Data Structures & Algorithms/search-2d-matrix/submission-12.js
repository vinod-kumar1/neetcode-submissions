class Solution {
    /**
     * @param {number[][]} matrix
     * @param {number} target
     * @return {boolean}
     */
    searchMatrix(matrix, target) {
        let l=0, cols = matrix[0].length;

let r = matrix.length * matrix[0].length -1;
        while(l <= r){

let m = l + Math.floor((r-l) / 2);
let row = Math.floor(m / cols);
let col = m % cols;

if(target > matrix[row][col]) l = m+1;
else if(target < matrix[row][col]) r = m-1;
else return true;     
}

return false;
}
}
