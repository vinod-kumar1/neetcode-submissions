class Solution {
    public boolean canJump(int[] nums) {
     int cur = 0;

for(int i = 0; i < nums.length - 1; i++){
    int n = nums[i];
    cur = Math.max(cur, n);

    if(cur == 0) return false;
    cur--;
}

return true;
    }
}
