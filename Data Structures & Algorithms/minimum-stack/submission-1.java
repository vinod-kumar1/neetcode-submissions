class MinStack {
ArrayList<Integer> arr;

    public MinStack() {
this.arr = new ArrayList<Integer>();        
    }
    
    public void push(int val) {
     this.arr.add(val);   
    }
    
    public void pop() {
        if(this.arr.size() > 0) this.arr.removeLast();
    }
    
    public int top() {
        if(this.arr.size() > 0) return this.arr.getLast();
    return -1;
    }
    
    public int getMin() {
        int min = this.arr.get(0);
        for(int i=1; i < this.arr.size() ; i++) min = Math.min(min , this.arr.get(i));
    return min;
    }
}
