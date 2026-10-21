class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
     Stack<Integer> st = new Stack<>();
int len = temperatures.length;
int res[] = new int[len];

     for(int i = len - 1; i >= 0; i--){
int n = temperatures[i];
while(!st.isEmpty() && temperatures[st.peek()] <= n) st.pop();

if(st.isEmpty()) res[i] = 0;
else res[i] = st.peek() - i;

st.push(i);
     }   

return res;
    }
}
