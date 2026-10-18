class Solution {

    public List<List<Integer>> combinationSum(int[] nums, int target) {
      List<List<Integer>> res = new ArrayList<>();
     trav(nums, target , res, new ArrayList<Integer>() , 0, 0);
return res;
    }

public void trav(int[] A, int target, List<List<Integer>> res , List<Integer> temp, int sum, int st)
{

if(sum > target) return;

if(sum == target){
    res.add(new ArrayList<>(temp));
    return;
}

for(int i=st; i < A.length; i++){
temp.add(A[i]);

trav(A , target , res, temp , sum + A[i] , i);

temp.remove(temp.size() - 1);
}

}

}
