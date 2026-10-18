class MedianFinder {
  constructor() {
    this.arr = [];
  }

  /**
   *
   * @param {number} num
   * @return {void}
   */
  addNum(num) {
    this.arr.push(num);
    this.arr.sort((a, b) => a - b);
  }

  /**
   * @return {number}
   */
  findMedian() {
    let x = this.arr.length / 2;
    let y = Math.max(x - 1, 0);
    // console.log("ds", this.arr.length % 2 == 0);
    return this.arr.length % 2 == 0
      ? (this.arr[x] + this.arr[y]) / 2
      : this.arr[Math.floor(this.arr.length / 2)];
  }
}