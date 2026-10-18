class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] map = new boolean[nums.length];
        trav(nums , new ArrayList<Integer>(), res , map);
    return res;
    }

public void trav(int[] nums, ArrayList<Integer> temp, List<List<Integer>> res, boolean[] map){

if(temp.size() >= nums.length){
    res.add(new ArrayList<>(temp));
    return;
}

for(int i=0; i < nums.length; i++){
    if(!map[i]){
        temp.add(nums[i]);
        map[i] = true;
        trav(nums , temp , res , map);

        temp.remove(temp.size() - 1);
        map[i] = false;
    }
}

}


}
