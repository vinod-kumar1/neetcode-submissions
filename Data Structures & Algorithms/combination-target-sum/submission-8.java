class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int i=0;
        dfs(nums , target , res , temp, i);
        return res;
    }


    public void dfs(int[] nums , int target , List<List<Integer>> res , List<Integer> temp, int i){
if(target == 0){
    res.add(new ArrayList<>(temp));
    return;
}
if(i >= nums.length || target < 0) return;
temp.add(nums[i]);
dfs(nums , target - nums[i] , res , temp , i);
temp.removeLast();
dfs(nums , target, res , temp , i+1);
    }
}
