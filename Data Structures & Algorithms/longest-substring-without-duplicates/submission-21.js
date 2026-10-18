class Solution {
    /**
     * @param {string} s
     * @return {number}
     */
    lengthOfLongestSubstring(s) {
        let l=0;
        let r=0;
        let mp = new Map();
let res = 0;

        while(r < s.length){
            if(mp.has(s[r])){
                l = Math.max(l, mp.get(s[r])+1);
            }
            mp.set(s[r], r);
            res = Math.max(res, r-l + 1);
            r++;
        }
        return res;
    }
}
