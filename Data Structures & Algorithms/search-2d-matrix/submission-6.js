class Solution {
    /**
     * @param {number[][]} matrix
     * @param {number} target
     * @return {boolean}
     */
    searchMatrix(matrix, target) {
//edge case
if(matrix.length <= 1) return matrix[0].indexOf(target) != -1;
if(matrix.every(m => m.length == 1)){
    let temp = matrix.flat();
    return temp.includes(target);
}
        let l = 0;
        let r = matrix.length-1;
        let res = new Set();

        while(l < r){
            let ll = matrix[l];
            let rr = matrix[r];
// if([ll.at(-1) , ll[0], rr.at(-1) , rr[0]].includes(target)) return true;
    if(target <= ll.at(-1) && target >= ll[0]) {
        res = new Set(ll)
        break;
        }  
    else if(target <= rr.at(-1) && target >= rr[0]){
res = new Set(rr);
break;
    } 
else{
    let m = l + Math.min((r-l)/2);
   let mm = matrix[m];
   console.log(mm);
    if(target >= mm[0] && target <= mm.at(-1)){
        res = new Set(mm);
        break;
    }
if(target < mm[0]) r = m-1;
else if(target > mm.at(-1)) l = m+1;
}
}

return res.has(target);
    }
}
