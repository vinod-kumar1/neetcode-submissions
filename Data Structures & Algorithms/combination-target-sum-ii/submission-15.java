class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> res = new ArrayList<>();
Arrays.sort(candidates);

      trav(candidates , target , 0, new ArrayList<Integer>(), res, 0);
    return res;
    }

public void trav(int[] A, int target, int i ,  ArrayList<Integer> temp , List<List<Integer>> res, int curSum){
if( i >= A.length || curSum >= target){
if(curSum == target){
    ArrayList<Integer> temp2 = new ArrayList<>();
    temp2.addAll(temp);
    res.add(temp2);
}
return;
}

int n = A[i];

temp.add(n);
trav(A , target , i + 1, temp , res , curSum + n); 
temp.removeLast();

while(i + 1 < A.length && A[i] == A[i + 1]) i++;
trav(A , target , i + 1, temp , res , curSum);


}

}
