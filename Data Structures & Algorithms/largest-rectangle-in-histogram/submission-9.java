class Solution {
    public int largestRectangleArea(int[] heights) {
     int len = heights.length;
        int ps[] = new int[len];
        int ns[] = new int[len];
    ps[0] = -1;
    ns[len - 1] = len;

    Stack<Integer> st = new Stack<>();
    st.push(0);

    for(int i = 1; i < len; i++){
        int n = heights[i];

        while(!st.isEmpty() && n <= heights[st.peek()]) st.pop();
        if(st.isEmpty()) ps[i] = -1;
        else ps[i] = st.peek();
        st.push(i);
    }

    st = new Stack<>();
    st.push(len - 1);

    for(int i = len - 2; i >= 0; i--){
        int n = heights[i];

        while(!st.isEmpty() && n <= heights[st.peek()]) st.pop();
        if(st.isEmpty()) ns[i] = len;
        else ns[i] = st.peek();
        st.push(i);
    }


int max = 0;

for(int i = 0; i < len; i++){
    int width = ns[i] - ps[i] - 1;
    max = Math.max(max , width * heights[i]);
}

return max;
    }
}