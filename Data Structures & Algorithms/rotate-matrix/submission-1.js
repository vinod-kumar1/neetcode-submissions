class Solution {
    /**
     * @param {number[][]} matrix
     * @return {void}
     */
    rotate(matrix) {
         matrix.reverse();

        // Transpose the matrix
        for (let i = 0; i < matrix.length; i++) {
            for (let j = i; j < matrix[i].length; j++) {
                if(i == j) continue;
                [matrix[i][j], matrix[j][i]] = [matrix[j][i], matrix[i][j]];
            }
        }
    }
}
