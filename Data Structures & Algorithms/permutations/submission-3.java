class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

trav(nums , res , new ArrayList<Integer>(), new HashSet<Integer>());
        return res;
    }

public void trav(int[] A, List<List<Integer>> res, ArrayList<Integer> temp , HashSet<Integer> vis){

if(temp.size() >= A.length){
res.add(new ArrayList<>(temp));
return;
}

for(int j=0; j < A.length; j++){
int n = A[j];

if(!vis.contains(A[j])){
temp.add(n);
vis.add(n);
trav(A , res , temp , vis);
int k = temp.remove(temp.size()-1);
vis.remove(k);
}

}

}

}
