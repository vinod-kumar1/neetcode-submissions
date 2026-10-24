class Solution {
    public int splitArray(int[] nums, int k) {
        int l = nums[0], r = 0;

        for(int n : nums){
            l = Math.max(l , n);
            r += n;
        }
int res = r;

while(l <= r){
    int m = l + ((r - l) / 2);

if(possible(nums , k , m)){
res = Math.min(res , m);
r = m - 1;
}
else l = m + 1;
}

return res;
    }

public boolean possible(int[] A, int k, int wg){

int cur = 0;
int splits = 1;

for(int n : A){
    if(cur + n > wg){
        cur = 0;
        splits++;
    }
    cur += n;
}

return splits <= k;
}

}