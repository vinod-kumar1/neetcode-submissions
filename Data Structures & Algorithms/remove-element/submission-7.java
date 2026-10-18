class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0, r = nums.length-1, count = 0;

        for(int i = 0; i <= r; i++){
            int n = nums[i];
            if(n == val){
                while(r > i && nums[r] == val) r--;
                int temp = nums[i];
                nums[i] = nums[r];
                nums[r] = temp;
           if(nums[i] != val) count++;
            r--;
            }
            else count++;
        }

    return count;
    }
}