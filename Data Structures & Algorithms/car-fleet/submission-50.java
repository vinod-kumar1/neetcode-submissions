class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> st = new Stack<>();

int len = position.length;
        int res[][] = new int[len][2];

for(int i=0; i < len; i++) res[i] = new int[] {position[i] , speed[i]};

Arrays.sort(res , (a,b) -> Integer.compare(a[0] , b[0]));

        for(int i=len-1; i >= 0; i--){
           int pos = res[i][0];
           int sp = res[i][1];

           double time = (target - pos) / (1.0 * sp);
        
        if(st.isEmpty()) st.push(time);
        else if(time > st.peek()) st.push(time);
        }

return st.size();
    }
}
