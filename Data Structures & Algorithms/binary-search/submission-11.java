class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length;

        while(l < r){
            int m = l + (r-l)/2;
            int val = nums[m];
            if(val == target) return m;
            else if(val < target) l++;
            else r--;
        }
        return -1;
    }
}
