class Solution {
    public int maxArea(int[] heights) {
        int l=0 , r = heights.length-1;
        int max = 0;

        while(l < r){
int total = Math.min(heights[l] , heights[r]) * (r-l);
if(total > max) max = total;
if(heights[l] < heights[r]) l++;
else r--;
        }   
return max;
         }
}
