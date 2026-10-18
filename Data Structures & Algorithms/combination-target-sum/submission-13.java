class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
    trav(nums, 0,  new ArrayList<Integer>() , 0, target, res);
    return res;
    }

public void trav(int[] nums, int j, ArrayList<Integer> temp, int cur, int target, List<List<Integer>> res){
    if(cur > target) return;
if(cur == target){
    res.add(new ArrayList<>(temp));
    return;
}

for(int i=j; i < nums.length; i++){
    temp.add(nums[i]);
    trav(nums, i, temp , cur + nums[i] , target,res);
    temp.remove(temp.size()-1);
}

}

}
