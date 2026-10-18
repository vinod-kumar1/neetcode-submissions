class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int res = 0;

for(String v : tokens){
    if(Character.isDigit(v.charAt(v.length()-1))) st.push(Integer.parseInt(v));
    else{
switch (v){
case "+": 
res = st.pop() + st.pop(); break;
case "-": 
 int a = st.pop();
 int b = st.pop();
res = b-a; 
 break;
case "*": 
res = st.pop() * st.pop();  break;
case "/": 
int n1 = st.pop();
int n2 = st.pop();
 res = n2 / n1;
  break;
        }
    st.push(res);
    }
}
return res == 0 ? st.pop() : res;
    }
}
