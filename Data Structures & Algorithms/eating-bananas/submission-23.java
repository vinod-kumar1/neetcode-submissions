class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int len = piles.length;
        int min = piles[0], max = piles[0];
        for(int n : piles) {
         min = Math.min(min , n);
        max = Math.max(max , n);
        }
        
        if(len == h) return max;
        

    int l = 1, r = max;
    min = max;

    while(l <= r){
int m = l + ((r-l) / 2);

if(finish(piles , m , h)){
    min = Math.min(min , m);
    r = m - 1;
}
else l = m + 1;
    }

    return min;
    }

public boolean finish(int[] A, int n, int max){
    int cur = 0;

    for(int k : A){
       cur += (int) (Math.ceil(k / (n * 1.0)));
       if(cur > max) return false;
    }

return cur <= max;
}

}
