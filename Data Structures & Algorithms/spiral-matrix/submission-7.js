class Solution {
    /**
     * @param {number[][]} matrix
     * @return {number[]}
     */
    spiralOrder(matrix) {
        let res = [];
        function run(m){
res.push(...m.shift());
for(let i=0; i < m.length - 1; i++){
    res.push(m[i].pop());
}
if(!m.length) return false;
res.push(...m.pop().reverse())
if(m.length > 0) {
    // m = m.reverse();
    for(let i=m.length-1; i >=0; i--){
        res.push(m[i].shift());
    }
    run(m)
};
}
        run(matrix);
 return res.filter(x => typeof x == "number");
    }
}
