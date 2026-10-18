class Solution {
    /**
     * @param {number[][]} matrix
     * @return {void}
     */
    setZeroes(matrix) {
        let arr = [];

function makeZeros(arr){
let temp = [];
for(let i=0; i < arr.length; i++){
    let [x, res] = arr[i];
    matrix[x].fill(0);
    temp.push(...res);
}

temp = Array.from(new Set(temp));
for(let m of matrix){
    for(let k of temp) m[k] = 0;
}
}

        for(let i=0; i < matrix.length; i++){
            let t2 = [];
            for(let j=0; j < matrix[i].length; j++){
let x = matrix[i][j];
if(x == 0) t2.push(j);
            }
            if(t2.length > 0) arr.push([i, t2]);
        }
        if(arr.length) makeZeros(arr);
return matrix;
    }
}
