class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> res = new ArrayList<>();
         trav(nums , 0 , res, new ArrayList<Integer>());
    return res;
    }

public void trav(int[] A, int i, List<List<Integer>> res, ArrayList<Integer> temp){

if(i >= A.length){
    res.add(new ArrayList<>(temp));
    return;
}

temp.add(A[i]);
trav(A , i + 1, res , temp);
temp.remove(temp.size() - 1);
trav(A , i + 1, res , temp);

}

}
