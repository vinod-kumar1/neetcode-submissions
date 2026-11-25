class Solution {
    public int maxSubarraySumCircular(int[] nums) {
int gmax = nums[0], gmin = nums[0], cmax = 0, cmin = 0, total = 0;


for(int n : nums){
    total += n;
    cmax = Math.max(n , cmax + n);
    cmin = Math.min(n , cmin + n);

    gmax = Math.max(gmax , cmax);
    gmin = Math.min(gmin , cmin);
}

return gmax > 0 ? Math.max(gmax , total - gmin) : gmax;

   }
}