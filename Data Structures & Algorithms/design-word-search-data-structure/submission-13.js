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
let keys = this.t.keys().filter(x => x.length == word.length);
for(let key of keys){
    for(let i=0; i < word.length; i++){
        let x = word[i];
        if(x == "."){
            if(i == word.length -1) return true;
            continue; 
        }
        if(x != key[i]) break;
        if(i == word.length -1) return true;
    }
}

return false;
}
        else return this.t.has(word);
    }
}
