class MinStack {
    constructor() {
        this.res = [];
    }

    /**
     * @param {number} val
     * @return {void}
     */
    push(val) {
        this.res.push(val);
    }

    /**
     * @return {void}
     */
    pop() {
        this.res.pop();
    }

    /**
     * @return {number}
     */
    top() {
        return this.res.at(-1);
    }

    /**
     * @return {number}
     */
    getMin() {
        return Math.min(...this.res);
    }
}
