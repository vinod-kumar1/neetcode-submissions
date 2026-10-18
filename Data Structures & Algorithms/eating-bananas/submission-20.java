class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long tot = 0;
        int len = piles.length;

        for(int n : piles) tot += n;
    long min = tot;

    long l = 1, r = tot;

    while(l <= r){
        long m = l + ((r-l)/2);
        long count = 0;

        for(int n : piles){
            long rate = (long) Math.ceil( n / (m * 1.0));
            count += rate;
        }

        if(count <= h) {
        min = Math.min(min , m);
         r = m-1;
         } else l = m+1;
         
        
    }
    
return (int) min;
    }
}
