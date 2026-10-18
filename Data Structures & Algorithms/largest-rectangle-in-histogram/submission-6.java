class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
int max = 0;
        for(int i=0; i <= heights.length; i++){

            while(!st.isEmpty() && (i == heights.length || heights[i] < heights[st.peek()])){
int id = st.pop();
int nse = i;
int pse = st.isEmpty() ? -1 : st.peek();
max = Math.max(max , heights[id] * (nse - pse - 1));
            }
            st.push(i);
        }
return max;
    }
}
