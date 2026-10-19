
class MyQueue {
LinkedList<Integer> ll;

    public MyQueue() {
 ll = new LinkedList<>();        
    }
    
    public void push(int x) {
ll.addLast(x);        
    }
    
    public int pop() {
      return ll.removeFirst();
    }
    
    public int peek() {
        return ll.getFirst();
    }
    
    public boolean empty() {
return ll.size() == 0;        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */