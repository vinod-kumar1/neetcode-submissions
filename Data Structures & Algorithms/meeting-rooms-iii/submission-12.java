
class Solution {
    public int mostBooked(int n, int[][] meetings) {

        Arrays.sort(meetings, (a,b) -> {
            if(a[0] == b[0])
                return Integer.compare(a[1], b[1]);

            return Integer.compare(a[0], b[0]);
        });

        PriorityQueue<long[]> pq1 = new PriorityQueue<>((a,b) -> {
            if(a[1] == b[1])
                return Long.compare(a[0], b[0]);

            return Long.compare(a[1], b[1]);
        });

        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        for(int i = 0; i < n; i++)
            pq2.offer(i);

        int[] res = new int[n];

        for(int[] temp : meetings) {

            long s = temp[0];
            long e = temp[1];

            while(!pq1.isEmpty() && pq1.peek()[1] <= s) {
                pq2.offer((int)pq1.poll()[0]);
            }

            int room;
            long end;

            if(!pq2.isEmpty()) {

                room = pq2.poll();
                end = e;

            } else {

                long[] curr = pq1.poll();

                room = (int)curr[0];

                long duration = e - s;

                end = curr[1] + duration;
            }

            res[room]++;

            pq1.offer(new long[]{room, end});
        }

        int max = 0;

        for(int i = 1; i < n; i++) {
            if(res[i] > res[max])
                max = i;
        }

        return max;
    }
}
