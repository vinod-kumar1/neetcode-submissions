class MinStack {
ArrayList<Integer> arr;
int min = (int) Math.pow(10,8);

    public MinStack() {
this.arr = new ArrayList<Integer>();        
    }
    
    public void push(int val) {
     this.arr.add(val);   
   min = Math.min(min , val);
    }
    
    public void pop() {
        if(this.arr.size() > 0) min = Math.min(this.arr.removeLast() , min);
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
