class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> st = new Stack<>();
        int arr[] = new int[temperatures.length];

        for(int i=0; i < temperatures.length; i++){
            int val = temperatures[i];
            if(st.isEmpty() || st.peek()[0] > val) st.push(new int[] { val , i});
            else{
while(st.size() > 0 && st.peek()[0] < val){
int v = st.peek()[0];
int id = st.peek()[1];
arr[id] = i - id;
st.pop();
}
st.push(new int[] {val , i});
            }
        }
    return arr;
    }
}
