class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
    trav(nums, 0,  new ArrayList<Integer>() , target, res);
    return res;
    }

public void trav(int[] nums, int i, ArrayList<Integer> temp, int target, List<List<Integer>> res){

if(target == 0){
    res.add(new ArrayList<>(temp));
    return;
}
    if(i >= nums.length || target < 0) return;

temp.add(nums[i]);
trav(nums, i , temp , target - nums[i] , res);
temp.remove(temp.size() - 1);
trav(nums, i + 1, temp , target , res);

}

}
