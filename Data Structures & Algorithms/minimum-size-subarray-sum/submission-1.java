class Solution {
    public int minSubArrayLen(int target, int[] nums) {
     int l=0, r=0, min = Integer.MAX_VALUE, n = nums.length, sum = 0;
     for(int k : nums) sum += k;
     if(sum < target) return 0;
     sum = 0;

while(r < n){
int m = nums[r];
sum += m;

while(sum >= target){
    min = Math.min(min , r-l+1);
    sum -= nums[l];
    l++;
}
r++;
}

return min;
}
}