class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(candidates);
    dfs(temp , res , candidates , target , 0 , 0);
    return res;
    }

public void dfs(List<Integer> temp , List<List<Integer>> res , int[] nums , int target , int sum , int i){
if(sum == target){
    res.add(new ArrayList<>(temp));
    return;
}
if(i >= nums.length || sum > target) return;

temp.add(nums[i]);
dfs(temp , res , nums , target , sum + nums[i] , i+1);
temp.removeLast();
while(i+1 < nums.length && nums[i] == nums[i+1]) i++;
dfs(temp , res , nums , target , sum , i+1);

    }
}
