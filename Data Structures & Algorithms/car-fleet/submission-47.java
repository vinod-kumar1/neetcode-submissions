class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
                int res[][] = new int[position.length][2];

for(int i=0; i < position.length; i++){
    res[i][0] = position[i];
    res[i][1] = speed[i];
}
        Arrays.sort(res , (a,b) -> Integer.compare(b[0] , a[0]));

        Stack<Double> st = new Stack<>();

        for(int[] p : res){
double sp = (double) (target - p[0]) / p[1];
        if(st.isEmpty() || sp > st.peek()) st.push(sp);
        }
        return st.size();
    }
}

// just check whether the previous car takes more steps than the next one. If it does, push it to stack, otherwise just continue as it will merge into its next car anyways