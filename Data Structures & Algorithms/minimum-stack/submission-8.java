class Item{
    int val;
    int min;

    Item(int v, int m){
        this.val =v ;
        this.min = m;
    }
}

class MinStack {
Stack<Item> st;

    public MinStack() {
st = new Stack<>();        
    }
    
    public void push(int val) {
if(st.isEmpty()){
    st.push(new Item(val , val));
}
else{
int min = st.peek().min;

    if(val < min) st.push(new Item(val , val));
    else st.push(new Item(val , min));
}
    }
    
    public void pop() {
st.pop();        
    }
    
    public int top() {
        return st.peek().val;
    }
    
    public int getMin() {
        return st.peek().min;
    }
}
