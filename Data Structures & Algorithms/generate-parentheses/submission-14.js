class Solution {
    /**
     * @param {number} n
     * @return {string[]}
     */
    generateParenthesis(n) {
        function backtrack(open, close, str, res){
if(close == open && open == n){
    res.push(str);
    return res;
}


if(open < n)  backtrack(open+1, close, str+"(", res);

if(close < open) backtrack(open , close+1, str+")", res);
        }
let res = [];
        backtrack(0,0,"",res)
    return res;
    }
}
