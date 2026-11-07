class Solution {
    public int[] getOrder(int[][] tasks) {
        int len = tasks.length;
        int temp[][] = new int[len][3];

        for(int i = 0; i < len; i++) temp[i] = new int[] {tasks[i][0] , tasks[i][1] , i};
        Arrays.sort(temp , (a,b) -> Integer.compare(a[0] , b[0]));

        long cur = temp[0][0];

        int idx = 0;
        int res[] = new int[len];
        int i = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a , b) -> {
            if(a[0] == b[0]) return Integer.compare(a[1] , b[1]);
            return Integer.compare(a[0] , b[0]);
        });

        while(idx < len){

            while(idx < len && temp[idx][0] <= cur){
                pq.offer(new int[] {temp[idx][1] , temp[idx][2]});
                idx++;
            }

            while(!pq.isEmpty()){
                int[] tt = pq.poll();
                res[i++] = tt[1];
                cur += tt[0];
                while(idx < len && temp[idx][0] <= cur){
                pq.offer(new int[] {temp[idx][1] , temp[idx][2]});
                idx++;
            }
            }

            if(idx < len && cur < temp[idx][0]) cur = temp[idx][0];
        }
    



return res;
}
}