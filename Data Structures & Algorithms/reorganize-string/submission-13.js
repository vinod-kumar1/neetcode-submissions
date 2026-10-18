class Solution {
  /**
   * @param {string} s
   * @return {string}
   */
  reorganizeString(s) {
    let res = new Array(26).fill(0);
    let out = [];
    for (let char of s) {
      res[char.charCodeAt(0) - "a".charCodeAt(0)]++;
    }

    let maxIdx = res.indexOf(Math.max(...res));
    let idx = 0;
    let maxChar = String.fromCharCode(
      "a".charCodeAt(0) + res.indexOf(Math.max(...res))
    );

    if (Math.max(...res) > (s.length + 1) / 2) return "";
    // added maxchar element first
    while (res[maxIdx] > 0) {
      out[idx] = maxChar;
      res[maxIdx]--;
      idx += 2;
    }

    // adding the remaining ones
    console.log(out);
    for (let i = 0; i < res.length; i++) {
      while (res[i] > 0) {
        if (idx >= s.length) idx = 1;
        out[idx] = String.fromCharCode("a".charCodeAt(0) + i);
        res[i]--;
        idx += 2;
      }
    }

    return out.join("");
  }
}