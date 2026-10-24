class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        int min = piles[0];

        for(int n : piles) {
         min = Math.min(min , n);
            max = Math.max(max , n);
        }
    int l = 1 , r = max;
int res = max;

    while(l <= r){
        int m = l + ((r -l )/ 2);
        if(canEat(piles , m , h)) {
        res = Math.min(res , m);
        r = m  - 1;
        }
        else l = m + 1;
    }

return res;
    }

public boolean canEat(int[] A, int B, int H){
    int cur = 0;

    for(int n : A){
    cur += (int) Math.ceil( n / (1.0 * B));
    if(cur > H) return false;
    }

    return true;
}

}
