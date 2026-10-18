class Solution {
    /**
     * @param {number[]} height
     * @return {number}
     */
    trap(height) {
        let l = 0;
        let r = height.length-1;
let maxL = height[l];
let maxR = height[r];
let storedWater = 0;

while(l < r){

if(maxL < maxR){
    l++;
    maxL = Math.max(maxL, height[l])
    storedWater+=(maxL - height[l]);
}
else{
    r--;
    maxR = Math.max(maxR, height[r])
    storedWater+=(maxR - height[r]);
}
// else l++;
}
return storedWater;
    }

}
