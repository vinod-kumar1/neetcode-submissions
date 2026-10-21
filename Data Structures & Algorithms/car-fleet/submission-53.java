class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> st = new Stack<>();
int len = position.length;

        int[][] temp = new int[len][2];

for(int i =0 ; i < len; i++) temp[i] = new int[] {position[i] , speed[i]};
Arrays.sort(temp , (a,b) -> Integer.compare(a[0] , b[0]));

for(int i = len - 1; i >= 0; i--){
    int arr[] = temp[i];

double time =  (target - arr[0]) / (1.0 * arr[1]);

  if(st.isEmpty()) st.push(time);
        else if(time > st.peek()) st.push(time);
        
}

return st.size();
    }
}

/*
0 1 4 7 -> pos
1 2 2 1 -> speed
1 3 6 8 -> 1st pass
2 4 8 9 
3 5
*/