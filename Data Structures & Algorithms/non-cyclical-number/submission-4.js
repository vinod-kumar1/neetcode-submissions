class Solution {
    /**
     * @param {number} n
     * @return {boolean}
     */
    isHappy(n) {
        let red = {};
        function run(n){
n = String(n);
let s = n.split("").map(Number).reduce((acc, cv) => acc + Math.pow(cv , 2),0)
if(s == 1) return true;
if(`${s}` in red) return false;
red[`${s}`] = true;
return run(s);
}
return run(n);
    }
}
