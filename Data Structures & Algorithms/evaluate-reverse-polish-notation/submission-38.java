class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s : tokens){
            switch(s){
                case "+":
                st.push(st.pop() + st.pop()); break;
                case "*":
                st.push(st.pop() * st.pop()); break;
                case "-":
                int a = st.pop();
                st.push(st.pop() - a); break;
                case "/":
                int b = st.pop();
                st.push(st.pop() / b); break;
                default:
                st.push(Integer.parseInt(s));
            }
        }
    return st.pop();
    }
}
