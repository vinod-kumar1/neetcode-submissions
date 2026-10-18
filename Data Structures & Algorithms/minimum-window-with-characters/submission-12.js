class Solution {
  /**
   * @param {string} s
   * @param {string} t
   * @return {string}
   */
  minWindow(s, t) {
    let needed = {};
    [...t].forEach((x) => (x in needed ? needed[x]++ : (needed[x] = 1)));
    let f = 0;
    let r = t.length;
    let res = [];

    function run(f, l) {
      if (l > s.length) return;
      let temp = { ...needed };
      let c = t.length;
      
      for (let i = f; i < l; i++) {
        if (s[i] in temp && temp[s[i]] > 0) {
          temp[s[i]] -= 1;
          c--;
        }
      }
      
      if (c == 0) {
        res.push(s.slice(f, l));
        run(f + 1, l);
      } else run(f, l + 1);
    }
    run(f, r);
    return !!res.length ? res.reduce((acc, cv) => (acc.length > cv.length ? cv : acc)) : "";
  }
}