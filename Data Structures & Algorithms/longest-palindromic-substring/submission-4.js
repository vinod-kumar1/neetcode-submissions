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

        // for odd length
for(let i=0; i < s.length; i++){
let l = i;
let r= i
        while(l >=0 && r < n && s[l] == s[r]){
if(r-l + 1 > res){
    res = r-l+1;
ll = l;
rr = r;
}
    --l;
    ++r;
        }

        // for even length
l = i;
r = i+1;
        while( l >= 0 && r < n && s[l] == s[r]){
if(r-l+1 > res) {
    res = r-l+1
    ll = l;
    rr = r;
    };
++r;
--l;
        }
    }
return s.slice(ll, rr + 1);
}
}
