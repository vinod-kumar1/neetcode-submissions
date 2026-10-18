class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l=0, r=1;
        while(l < nums.length && r < nums.length){
           if(nums[l] == nums[r]){
            if(Math.abs(l-r) <= k) return true;
            l=r;
           }
           r++;
           if(r >= nums.length){
            l++;
            r = l+1;
           }
        }
    return false;
    }
}