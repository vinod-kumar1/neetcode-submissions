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
int d = 0;

for(int n : weights){
if(cur == 0) d++;

cur += n;

if(cur > wg){
    cur = n;
    d++;
}
else if(cur == wg){
    cur = 0;
}
 
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