class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<List<Integer>> st = new Stack<>();
        int arr[] = new int[temperatures.length];

        for(int i=0; i < temperatures.length; i++){
            int val = temperatures[i];
            if(st.isEmpty() || st.peek().get(0) > val) st.push(List.of( val , i));
            else{
while(st.size() > 0 && st.peek().get(0) < val){
int v = st.peek().get(0);
int id = st.peek().get(1);
arr[id] = i - id;
st.pop();
}
st.push(List.of(val , i));
            }
        }
    return arr;
    }
}
