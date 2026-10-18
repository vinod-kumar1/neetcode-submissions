class WordDictionary {
    constructor() {
        this.t = new Map();
    }

    /**
     * @param {string} word
     * @return {void}
     */
    addWord(word) {
        this.t.set(word , 1);
    }

    /**
     * @param {string} word
     * @return {boolean}
     */
    search(word) {
if(word.indexOf(".") != -1){
    let keys = Array.from(this.t.keys()).filter(x => x.length == word.length);
let ids= word.split("").map((x,i) => x == "." ? i : "").filter(x => typeof x == "number");
 word = word.replaceAll("." , "");
keys = keys.map(temp => temp.split("").filter((_,i) => ids.indexOf(i) == -1).join(""));
console.log(keys , word);
return keys.includes(word);
}
        else return this.t.has(word);
    }
}
