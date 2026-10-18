class Solution {
    /**
     * @param {number} numRows
     * @return {number[][]}
     */
    generate(numRows) {
        let st = [[1]];
        if(numRows <= 1) return st;

        let n = 1;

        while(n < numRows){
            let temp1 = st.at(-1);
            let len = temp1.length;
let temp2 = [temp1[0]];
let k = temp1.at(-1);

for(let i=1; i < len; i++) temp2.push(temp1[i] + temp1[i-1]);
temp2.push(k);

            n++;
            st.push(temp2);
            }
                return st;
                }
}
