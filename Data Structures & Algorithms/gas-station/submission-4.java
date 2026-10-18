class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       if(Arrays.stream(gas).sum() < Arrays.stream(cost).sum()) return -1;
       
        int rem = 0;
        int idx = 0;

        for(int i=0; i < cost.length; i++){
            int n = gas[i] - cost[i];
            rem += n;
            if(rem < 0){
                rem = 0;
                idx = i + 1;
            }
        }

    return idx; 
    }
}
