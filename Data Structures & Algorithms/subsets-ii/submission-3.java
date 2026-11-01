class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        trav(nums , new ArrayList<Integer>() , res, 0);
return res;
    }

public void trav(int[] A, ArrayList<Integer> temp , List<List<Integer>> res , int i){
    if(i >= A.length){
        ArrayList<Integer> temp2 = new ArrayList<>();
        temp2.addAll(temp);
        res.add(temp2);
        return;
    }

temp.add(A[i]);
trav(A , temp , res , i + 1);

temp.removeLast();
while(i + 1 < A.length && A[i] == A[i + 1]) i++;
trav(A , temp , res , i + 1);

}

}
