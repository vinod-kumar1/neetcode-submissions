class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(candidates);
    trav(candidates, 0,  new ArrayList<Integer>() , target, res);
    return res;
    }

public void trav(int[] nums, int i, ArrayList<Integer> temp, int target, List<List<Integer>> res){

if(target == 0){
    res.add(new ArrayList<>(temp));
    return;
}

if(i >= nums.length || target < 0) return;

temp.add(nums[i]);
trav(nums, i + 1 , temp , target - nums[i] , res);

temp.remove(temp.size() - 1);
while(i + 1 < nums.length && nums[i+1] == nums[i]) i++;
trav(nums, i + 1, temp , target , res);

    }
}
