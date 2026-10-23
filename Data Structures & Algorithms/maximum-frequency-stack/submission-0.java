class FreqStack {
HashMap<Integer, Integer> freq;
HashMap<Integer, Stack<Integer>> st;
int max;

    public FreqStack() {
        freq = new HashMap<>();
        st = new HashMap<>();
    }
    
    public void push(int val) {
       freq.put(val , freq.getOrDefault(val, 0) + 1);

       int num = freq.get(val);

if(num > max){
    max = num;
}

if(!st.containsKey(num)) st.put(num , new Stack<>());
st.get(num).push(val);
    }
    
    public int pop() {

int val = st.get(max).pop();
freq.put(val , freq.get(val) - 1);

if(st.get(max).size() == 0) max--;

return val;

    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */