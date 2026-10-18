class PrefixTree {
    constructor() {
        this.t = new Map();
    }

    /**
     * @param {string} word
     * @return {void}
     */
    insert(word) {
        this.t.set(word, 1);
    }

    /**
     * @param {string} word
     * @return {boolean}
     */
    search(word) {
        return this.t.has(word);
    }

    /**
     * @param {string} prefix
     * @return {boolean}
     */
    startsWith(prefix) {
        return this.t.keys().some(x => x.startsWith(prefix));
    }
}
