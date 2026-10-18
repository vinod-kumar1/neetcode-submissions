class Solution {
    /**
     * @param {string[]} strs
     * @returns {string}
     */
    #privateKey;
constructor(){
    this.#privateKey = "@123##";
}

    encode(strs) {
let res = "";
for(let s of strs){
    res+=s+ "##*";
}
return res;
    }

    /**
     * @param {string} str
     * @returns {string[]}
     */
    decode(str) {
        let res = str.split("##*");
        res.pop();
return res;
 }
}
