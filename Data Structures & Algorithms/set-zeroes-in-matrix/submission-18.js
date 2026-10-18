class Solution {
    /**
     * @param {number[][]} matrix
     * @return {void}
     */
    setZeroes(matrix) {

function makeZero(temp){
for(let i=0; i < temp.length; i++){
   let [x,arr] = temp[i];
    matrix[x].fill(0);

while(arr.length > 0){
    let z = arr.pop();
    for(let n of matrix){
        n[z] = 0;
    }
}
}
}

let temp = [];
        for(let i=0; i < matrix.length; i++){
            if(matrix[i].indexOf(0) == -1) continue;
            let t2 = [];
            for(let j=0; j < matrix[i].length; j++){
                let x = matrix[i][j];
                if(x == 0) t2.push(j);
            }
if(t2.length > 0) temp.push([i , t2]);
t2 = [];
        }
if(temp.length > 0) makeZero(temp);
    return matrix;
    }
}
