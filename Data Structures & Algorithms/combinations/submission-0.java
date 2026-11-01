class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        trav(n , k , res , new ArrayList<Integer>());
return res;
    }

public void trav(int n, int k, List<List<Integer>> res, ArrayList<Integer> temp){
    if(n == 0 || temp.size() == k){
        if(temp.size() == k){
        ArrayList<Integer> temp2 = new ArrayList<>();
        temp2.addAll(temp);
        res.add(temp2);
        }
    return;
    }

temp.add(n);
trav(n - 1 , k , res , temp);

temp.removeLast();
trav(n - 1 , k , res , temp);

}

}