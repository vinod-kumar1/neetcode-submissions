class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        trav(nums, 0, res, new ArrayList<Integer>());
        return res;
    }

public void trav(int[] nums, int i, List<List<Integer>> res, ArrayList<Integer> temp){

res.add(new ArrayList<>(temp));

for(int j=i; j < nums.length; j++){
if(j > i && nums[j] == nums[j-1]) continue;

    temp.add(nums[j]);
    trav(nums , j+1 , res , temp);

    temp.remove(temp.size()-1);
}


    
}

}
