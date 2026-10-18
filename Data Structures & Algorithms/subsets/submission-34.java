class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
         trav(nums , 0 , new ArrayList<Integer>(), res);
    return res;
    }

    public void trav(int[] nums, int i, ArrayList<Integer> temp, List<List<Integer>> res){
        if( i >= nums.length) {
        res.add(new ArrayList<>(temp));
            return;
        }
        
        temp.add(nums[i]);
        trav(nums , i + 1, temp , res);
        temp.remove(temp.size() - 1);
        trav(nums , i + 1, temp , res);
    }
}
