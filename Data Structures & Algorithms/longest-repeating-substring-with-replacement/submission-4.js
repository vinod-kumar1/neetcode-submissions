class Solution {
    /**
     * @param {string} s
     * @param {number} k
     * @return {number}
     */
    characterReplacement(s, k) {
        let maxf = 0;
        let res = 0;
        let c = new Map();
        let l = 0;

        for(let r=0; r < s.length; r++){
            c.set(s[r] , (c.get(s[r]) || 0) + 1);
            maxf = Math.max(maxf , c.get(s[r]));

            while(r - l + 1 - maxf> k){
                c.set(s[l] ,c.get(s[l])-1);
                l++;
            }
            res = Math.max(res , r-l+1);
        }
        return res;
    }
}
