class Solution {
    public void sortColors(int[] nums) {
     int l = 0, r = nums.length - 1;

     for(int i = 0; i <= r; i++){
        int n = nums[i];

        if(n == 0){
            int temp = nums[l];
            nums[l] = nums[i];
            nums[i] = temp;
            l++;
        }

        if(n == 2){
            int temp = nums[r];
            nums[r] = nums[i];
            nums[i] = temp;
            r--;
            if(nums[i] == 0 || nums[i] == 2) i--;
        }
     }   
    }
}