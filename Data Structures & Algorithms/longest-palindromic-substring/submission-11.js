class Solution {
    /**
     * @param {string} s
     * @return {string}
     */
    longestPalindrome(s) {
        let n = s.length;
        let ll=0;
        let rr=0;
        let res =0;

function outSearch(l,r){
        while(l >=0 && r < n && s[l] == s[r]){
if(r-l + 1 > res){
    res = r-l+1;
ll = l;
rr = r;
}
    --l;
    ++r;
        }
}

for(let i=0; i < s.length; i++){
outSearch(i,i);
outSearch(i, i+1);
    }
return s.slice(ll, rr + 1);
}
}
