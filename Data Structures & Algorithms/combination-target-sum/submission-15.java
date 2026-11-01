class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        trav(nums , target , new ArrayList<Integer>(), res , 0, 0);
        return res;
    }

public void trav(int[] A, int target, ArrayList<Integer> temp , List<List<Integer>> res, int i, int cur){

if(i >= A.length || cur >= target){
if(cur == target){
ArrayList<Integer> temp2 = new ArrayList<>();
temp2.addAll(temp);
res.add(temp2);
}
return;
}

int n = A[i];

temp.add(n);
 trav(A , target , temp , res , i , cur + A[i]);

 temp.removeLast();
    trav(A , target , temp , res , i + 1 , cur);

}

}
