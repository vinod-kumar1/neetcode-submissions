class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;

int min = nums[0];

        while(l <= r){
            int m = l + ((r - l) / 2);
            int n = nums[m];
min = Math.min(min , n);
            
            if(nums[l] < nums[r]){
                min = Math.min(min , nums[l]);
                break;
            }
            else{
                if(n < nums[r]) r = m - 1;
                else l = m + 1;
            }
        }

return min;
    }
}
