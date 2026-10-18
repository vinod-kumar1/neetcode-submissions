class Solution {
    /**
     * @param {string} s1
     * @param {string} s2
     * @return {boolean}
     */
    checkInclusion(s1, s2) {
let len = 0;
let temp = s1.split("").sort().join("");

        for(let i=0; i< s2.length; i++){
        if(s1.includes(s2[i])){
           if(temp == s2.slice(i, i+s1.length).split('').sort().join("")) return true;
        }
        }
        return false;
    }
}
