class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min = weights[0];
        int max = 0;
        for(int n : weights){
            min = Math.max(min , n);
            max += n;
        }
int l = min, r = max;
int res = max;

while(l <= r){
int wg = l + ((r - l) / 2);
int cur = 0;
int d = 1;

for(int n : weights){
 if(cur + n > wg){
    cur = 0;
    d++;
 }
 cur += n;
 
 if(d > days) break;
}

if(d <= days){
    r = wg - 1;
    res = Math.min(res , wg);
}
else l = wg + 1;

}


return res;
    }

}