class Solution {
    public int largestRectangleArea(int[] heights) {
      int len = heights.length;
        int ns[] = new int[len];
        int ps[] = new int[len];

Stack<Integer> st = new Stack<>();

for(int i=0; i < len; i++){
    int n = heights[i];

    if(st.isEmpty()) ps[i] = -1;
    else{
       // monotonic Stack
       while(!st.isEmpty() && heights[st.peek()] >= n) st.pop();
       if(st.isEmpty()) ps[i] = -1;
       else ps[i] = st.peek();
    }
    st.push(i);
}

st.clear();

for(int i=len-1; i >= 0; i--){
    int n = heights[i];

    if(st.isEmpty()) ns[i] = len;
    else{
       // monotonic Stack
       while(!st.isEmpty() && heights[st.peek()] >= n) st.pop();
       if(st.isEmpty()) ns[i] = len;
       else ns[i] = st.peek();
    }
    st.push(i);
}
 
 int max = 0;

 for(int i=0; i < len; i++){
    int n = heights[i];
    int wid = ns[i] - ps[i] - 1;
max = Math.max(max , wid * n);
 }

return max;

    }
}
