class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1;
int max = 0;

        while(l < r){
            int lh = heights[l];
            int rh = heights[r];
max = Math.max(max , (r-l) * Math.min(lh , rh));
if(lh < rh) l++;
else r--;        
        }

return max;
    }
}
