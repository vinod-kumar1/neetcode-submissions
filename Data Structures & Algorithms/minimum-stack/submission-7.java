class MinStack {
Stack<int[]> st;
int min = 0;

    public MinStack() {
st = new Stack<>();        
    }
    
    public void push(int val) {
if(st.isEmpty()){
    st.push(new int[] {val , val});
    min = val;
}
else{
    if(val < min) min = val;
    st.push(new int[] {val , min});
}
    }
    
    public void pop() {
st.pop();        
if(!st.isEmpty()) min = st.peek()[1];
    }
    
    public int top() {
        return st.peek()[0];
    }
    
    public int getMin() {
        return st.peek()[1];
    }
}
