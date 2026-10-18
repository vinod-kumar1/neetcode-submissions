class Solution {
    public int minEatingSpeed(int[] piles, int h) {
     int r = piles[0];
     for(int n : piles) r = Math.max(r , n);
        if(h == piles.length) return r;
    int l = 1;
    int res = Integer.MAX_VALUE;

while(l <= r){
    int m = l + (r-l)/2;
    int sum = 0;
    for(int n : piles) sum += (int) Math.ceil((double) n / m);
    if(sum <= h){
        res = m;
        r = m-1;
    } 
    else l = m+1;
}

return res;
    }
}
