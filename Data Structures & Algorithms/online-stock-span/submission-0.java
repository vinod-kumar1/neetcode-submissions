class StockSpanner {
Stack<Integer> st;

    public StockSpanner() {
st = new Stack<>();
    }
    
    public int next(int price) {

if(st.isEmpty() || st.peek() > price){
    st.push(price);
    return 1;
}

Stack<Integer> temp = new Stack<>();
int count = 1;

while(!st.isEmpty() && st.peek() <= price){
count++;
temp.push(st.pop());
}

while(!temp.isEmpty()) st.push(temp.pop());
st.push(price);
return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */