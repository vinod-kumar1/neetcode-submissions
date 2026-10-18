class MyHashSet {
    constructor() {
        this.set = []
    }

    /**
     * @param {number} key
     * @return {void}
     */
    add(key) {
        if(this.set.indexOf(key) == -1) this.set.push(key);
    }

    /**
     * @param {number} key
     * @return {void}
     */
    remove(key) {
        let idx = this.set.indexOf(key);
        if(idx != -1){
            this.set.splice(idx,1)
        }
    }

    /**
     * @param {number} key
     * @return {boolean}
     */
    contains(key) {
        return this.set.indexOf(key) != -1;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = new MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */
