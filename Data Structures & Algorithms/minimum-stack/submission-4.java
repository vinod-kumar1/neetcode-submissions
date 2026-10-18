class MinStack {
Stack<Integer> st1;
Stack<Integer> st2;

    public MinStack() {
      st1 = new Stack<>();        
      st2 = new Stack<>();        
    }
    
    public void push(int val) {
        st1.push(val);

    if(st2.isEmpty()) st2.push(val);
    else{
        if(st2.peek() < val) st2.push(st2.peek());
        else st2.push(val);
    }
    }
    
    public void pop() {
st1.pop();
st2.pop();
    }
    
    public int top() {
return st1.peek();        
    }
    
    public int getMin() {
        return st2.peek();
    }
}
