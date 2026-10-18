class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
    
    for(int n = 0; n < nums.length; n++){
if(temp.contains(nums[n])) return true;

temp.add(nums[n]);
    }
    return false;
    }
}