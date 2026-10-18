class TimeMap {
    constructor() {
        this.keyStore = new Map();
    }

    /**
     * @param {string} key
     * @param {string} value
     * @param {number} timestamp
     * @return {void}
     */
    set(key, value, timestamp) {
        if(!this.keyStore.has(key)){
            this.keyStore.set(key,[]);
        }
   this.keyStore.get(key).push([timestamp , value]);
    }

    /**
     * @param {string} key
     * @param {number} timestamp
     * @return {string}
     */
    get(key, timestamp) {
        if(this.keyStore.has(key)){
            let temp = this.keyStore.get(key);
for(let i=temp.length - 1; i>=0; i--){
    if(temp[i][0] <= timestamp) return temp[i][1];
}
        }
        return "";
    }
}
