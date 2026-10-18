class Solution {
    /**
     * @param {number[][]} matrix
     * @param {number} target
     * @return {boolean}
     */
    searchMatrix(matrix, target) {
        function searchRow(){
            let l = 0;
            let r = matrix.length-1;
            while(l <= r){
                let m = Math.floor(l + ((r-l) / 2));
                let row = matrix[m];
                if(target >= row[0] && target <= row.at(-1)){
                   return searchVal(row);
                }
                if(target > row.at(-1)) l = m+1;
                else r = m-1;
            }
            return false;
        }

        function searchVal(row){
let l = 0, r= row.length-1;

while(l <= r){
let m = Math.floor(l + ((r-l) / 2));
if(row[m] == target) return true;
if(target > row[m]) l = m+1;
else r = m-1;    
}

return false;
        }
    return searchRow();
    }
}
