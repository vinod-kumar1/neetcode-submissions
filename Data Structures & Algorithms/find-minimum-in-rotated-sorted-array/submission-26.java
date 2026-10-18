class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        int min = nums[0];

        while (l <= r) {
            int m = l + ((r - l) / 2);
            int n = nums[m];
            if (nums[l] < nums[r]) {
                min = Math.min(min, nums[l]);
                break;
            }
            min = Math.min(min, nums[m]);
            if(n >= nums[l]) l = m+1;
            else r = m-1;

        }

        return min;
    }
}
