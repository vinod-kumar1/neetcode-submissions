class Solution {

public void dfs(List<List<Integer>> res , int[] nums, int i, List<Integer> temp){
if(i == nums.length){
res.add(new ArrayList<>(temp));
return;
}

temp.add(nums[i]);
dfs(res , nums , i+1 , temp);
temp.removeLast();
dfs(res , nums , i+1 , temp);

}

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
       List<Integer> temp = new ArrayList<Integer>();
dfs(res , nums, 0 , temp);
return res;
    }
}
