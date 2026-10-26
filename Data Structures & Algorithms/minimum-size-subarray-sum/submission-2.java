class Solution {
    public int minSubArrayLen(int target, int[] nums) {
     int sum = 0;
int min = Integer.MAX_VALUE;
int l = 0;

        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            sum += n;

            if(sum >= target){
while(sum - nums[l] >= target) sum -= nums[l++];
min = Math.min(min , i - l + 1);
            }
        }

return min == Integer.MAX_VALUE ? 0 : min;
    }
}