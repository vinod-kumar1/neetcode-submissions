class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s : tokens){
            switch(s){
                case "+" -> st.push(st.pop() + st.pop());
                case "*" -> st.push(st.pop() * st.pop());
                case "-" -> {
                int a = st.pop();
                st.push(st.pop() - a);
                }
                case "/" -> {
                int b = st.pop();
                st.push(st.pop() / b);
                }
                default -> st.push(Integer.parseInt(s));
            }
        }
    return st.pop();
    }
}
