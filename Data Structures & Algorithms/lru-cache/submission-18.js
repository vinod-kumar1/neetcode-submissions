class LRUCache {
  /**
   * @param {number} capacity
   */
  constructor(capacity) {
    this.map = new Map();
    this.capacity = capacity;
    this.f = 0;
  }

reset(){
this.f = 0;
this.map.forEach((k , i) => {
let x = this.map.get(k);
x.f = i+1;
this.map.set(k, x);
})
}

  /**
   * @param {number} key
   * @return {number}
   */
  get(key) {
    if(this.map.get(key)?.f > 10000000000) this.reset();
    if (!this.map.has(key)) return -1;
    let obj = this.map.get(key);
    obj.f = ++this.f;
    this.map.set(key, obj);
    console.log(`get ${key}`,this.map)
    return obj.v;
  }

  /**
   * @param {number} key
   * @param {number} value
   * @return {void}
   */
  put(key, value) {
    if (this.map.has(key)) {
      let temp = this.map.get(key);
      temp.v = value;
      temp.f = ++this.f;
      this.map.set(key, temp);
      temp = "";
    } else {
      if (this.map.size + 1 > this.capacity) {
        let min = Infinity;
        let dkey;
        this.map.keys().forEach((k) => {
          let x = this.map.get(k).f;
          if (x < min) {
            min = x;
            dkey = k;
          }
        });
        this.map.delete(dkey);
      }

      this.map.set(key, {
        v: value,
        f: ++this.f,
      });
    }
    console.log(`put ${key} , ${value}`,this.map)
  }
}