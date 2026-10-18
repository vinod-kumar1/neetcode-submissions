class Solution {
    /**
     * @param {string} s
     * @return {string}
     */
    longestPalindrome(s) {
let max = 1;
let l = 0;
let r = 0;

function isPal(i,j){
    while(i < j){
if(s[i] != s[j]) return false;
i++;
j--;
    }
    return true;
}

        function dfs(i,j){
if(i >= s.length) return;

if(isPal(i,j) && j-i+1 > max) {
    max = j-i+1;
l = i;
r = j;
}
j++;
if(j >= s.length){
    i++;
    j=i+1;
}
dfs(i,j);
        }
        dfs(0,0);
    return s.slice(l,r+1);
    }
}
