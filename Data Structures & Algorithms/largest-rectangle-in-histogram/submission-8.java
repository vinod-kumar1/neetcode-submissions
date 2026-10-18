class Solution {
    public int largestRectangleArea(int[] heights) {
int len = heights.length;

        int[] ps = new int[len];
        int[] ns = new int[len];

Stack<Integer> st = new Stack<>();

// next smaller number
int idx = len - 1;

for(int i = len - 1; i>= 0; i--){
    int n = heights[i];

    if(st.isEmpty()) ns[i] = len;
    else{
        while(!st.isEmpty() && n <= heights[st.peek()]) st.pop();
    if(st.isEmpty()) ns[i] = len;
    else ns[i] = st.peek();
    }
    st.push(i);
}

st.clear();
idx = 0;

for(int i = 0; i < len; i++){
    int n = heights[i];

    if(st.isEmpty()) ps[i] = -1;
    else{
    while(!st.isEmpty() && n <= heights[st.peek()]) st.pop();
    if(st.isEmpty()) ps[i] = -1;
    else ps[i] = st.peek();
    }
    st.push(i);
}

int max = 0;

for(int i=0; i < len; i++){
    int cur = ns[i] - ps[i] - 1;
    max = Math.max(max , heights[i] * cur);
}

return max;

    }
}
