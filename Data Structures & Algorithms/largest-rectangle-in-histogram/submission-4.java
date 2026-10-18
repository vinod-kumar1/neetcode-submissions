class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;

        for(int i=0; i < heights.length; i++){
int area = heights[i];
int l = i-1;
int r = i+1;
int cur = heights[i];

while(true){
boolean found = false; 
if(l >= 0 && heights[l] >= cur){
    area+= heights[i];
l--;
found = true;
} 
if(r < heights.length && heights[r] >= cur){
    area += heights[i];
    r++;
found = true;
}

if(!found) break;
}
 max = Math.max ( max , area);
        }
    return max;
    }
}
