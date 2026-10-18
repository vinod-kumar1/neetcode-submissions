class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
         trav(nums , res , new ArrayList<>() , 0);
    return res;
    }

public void trav(int[] A, List<List<Integer>> res, ArrayList<Integer> temp , int st){

    res.add(new ArrayList<>(temp));


for(int i=st; i < A.length; i++){
if(i > st && A[i] == A[i-1]) continue;

temp.add(A[i]);
trav(A , res , temp , i + 1);

temp.remove(temp.size()-1);

}
}

}
