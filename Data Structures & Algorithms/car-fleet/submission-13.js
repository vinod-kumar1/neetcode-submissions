class Solution {
    /**
     * @param {number} target
     * @param {number[]} position
     * @param {number[]} speed
     * @return {number}
     */
    carFleet(target, position, speed) {
     let res = position.map((x,i) => [x , speed[i]]);
     res = res.sort((a,b) => a[0] - b[0]);
     let f = position.length;
console.log(res);
     let time = res.map(([p,s]) => (target - p) / s);

     for(let i=0; i < time.length - 1; i++){
let k = i;
while( k < time.length - 1){
    if(time[i] <= time[k+1]){
        f--;
    break;
    }
     k++;
}
}
     return f;
    }
}
