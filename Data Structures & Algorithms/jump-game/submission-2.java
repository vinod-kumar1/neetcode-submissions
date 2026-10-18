class Solution {
    public boolean canJump(int[] nums) {
      if(nums.length == 1) return true;
      
      int rem = nums[0];

      for(int i=1;  i < nums.length; i++){
        if(rem <= 0) return false;
        rem--;
        if(nums[i] > rem) rem = nums[i];
      }

return true;
    }
}
