class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
       int len = position.length;

        int[][] temp = new int[len][2];
    
for(int i =0 ; i < len; i++) temp[i] = new int[] {position[i] , speed[i]};
Arrays.sort(temp , (a , b) -> Integer.compare(a[0] , b[0]));

Stack<Double> st = new Stack<>();

for(int[] item : temp){
    double time = (target - item[0]) / (1.0 * item[1]);

while(!st.isEmpty() && st.peek() <= time) st.pop();
st.push(time);
}


return st.size();

    }
}
