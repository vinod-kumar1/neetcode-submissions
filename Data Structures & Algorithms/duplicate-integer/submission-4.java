class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
    
    for(int n : nums){
        if(temp.contains(n)) return true;
        temp.add(n);
    }
    return false;
    }
}