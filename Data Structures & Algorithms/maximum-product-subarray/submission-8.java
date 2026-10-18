class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

int pm = 1, sm = 1;
int n = nums.length;
int out = Integer.MIN_VALUE;

for(int i=0; i < nums.length; i++){
    pm *= nums[i];
    sm *= nums[n - i - 1];
out = Math.max(out , Math.max(pm , sm));
if(pm == 0) pm = 1;
if(sm == 0) sm = 1;
}

return out;
    }
}
