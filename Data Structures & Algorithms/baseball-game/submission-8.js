class Solution {
    /**
     * @param {string[]} operations
     * @return {number}
     */
calPoints(operations) {
  let rec = [];
  for (let i = 0; i < operations.length; i++) {
    let x = operations[i];
    if (x >= 0 || x < 0) rec.push(Number(x));
    else if (x == "+") {
      let temp = 0;
      if (rec.at(-1) != undefined) temp += rec.at(-1);
      if (rec.at(-2) != undefined) temp += rec.at(-2);
      rec.push(temp);
    } else if (x == "C") rec.pop();
    else if (x == "D") if (rec.at(-1) != undefined) rec.push(rec.at(-1) * 2);
  }
  console.log(rec);
  return rec.reduce((a, c) => a + Number(c), 0);
}
}
