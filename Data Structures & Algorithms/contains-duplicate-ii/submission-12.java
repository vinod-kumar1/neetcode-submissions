class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l=0, r=0;
        Set<Integer> set = new HashSet<>();

while(r < nums.length){
if(Math.abs(r-l) > k){
    set.remove(nums[l]);
    l++;
}

int n = nums[r];
if(set.contains(n)) return true;
set.add(n);

r++;
}

return false;
    }
}