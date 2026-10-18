class Solution {
    /**
     * @param {number} target
     * @param {number[]} position
     * @param {number[]} speed
     * @return {number}
     */
    carFleet(target, position, speed) { 
        
    let res = position.map((x, i) => [x , speed[i]]);
    res = res.sort((a,b) => b[0] - a[0]);
console.log(res);
    let st = [];

    for(let i=0; i < res.length; i++){
        let [p , s] = res[i];
        let time = (target - p) / s;
        st.push(time);
        if(st.length >= 2 && st.at(-1) <= st.at(-2)) st.pop(); 
    }

    return st.length;}
}
