class MinStack {
ArrayList<Integer> st;
int min;

    public MinStack() {
     st = new ArrayList<>();        
    min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
      if(val < min) min = val;
      st.add(val);        
    }
    
    public void pop() {
        int n = st.removeLast();
        if(n == min){
            min = Integer.MAX_VALUE;
            for(int k : st) min = Math.min(min , k);
        }
    }
    
    public int top() {
      return st.getLast();        
    }
    
    public int getMin() {
        return this.min;
    }
}
