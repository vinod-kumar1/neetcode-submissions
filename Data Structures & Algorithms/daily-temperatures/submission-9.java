class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        int idx = temperatures.length - 1;
        Stack<Integer> st = new Stack<>();

        for(int i=temperatures.length - 1; i >= 0; i--){
            if(st.isEmpty()) res[idx--] = 0;
            else{
while(!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]) st.pop();
              if(st.isEmpty()) res[idx--] = 0;
              else res[idx--] = st.peek() - i;
            }
            st.push(i);
        }

    return res;
    }
}
