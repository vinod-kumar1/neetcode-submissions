class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0; i < nums.length; i++){
            int n = nums[i];
            for(int j=i+1; j < nums.length; j++){
                if(nums[j] == n && (j-i) <=k ) return true;
            }
        }
    return false;
    }
}