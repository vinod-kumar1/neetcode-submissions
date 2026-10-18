class Solution {
    /**
     * @param {number[]} heights
     * @return {number}
     */
    maxArea(heights) {
        let l=0;
        let r = heights.length-1;
let max = 0;
        while(l < r){
let left = heights[l];
let right = heights[r];
max = Math.max(max, Math.min(left, right) * (r-l));
if(left < right) l++;
else if(left > right) r--;
else l++;

        }
return max;
    }
}
