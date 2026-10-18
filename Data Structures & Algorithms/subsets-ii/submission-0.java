class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
Arrays.sort(nums);
        dfs(nums , res , temp , 0);
        return res;
    }

public void dfs(int[] nums , List<List<Integer>> res , List<Integer> temp , int i){
    if(i >= nums.length){
        res.add(new ArrayList<>(temp));
        return;
    }

temp.add(nums[i]);
dfs(nums , res , temp , i+1);
temp.removeLast();
while(i + 1 < nums.length && nums[i] == nums[i+1]) i++;
dfs(nums , res , temp , i+1);

}
}
