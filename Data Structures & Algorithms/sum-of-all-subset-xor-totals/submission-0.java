class Solution {
    public int subsetXORSum(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        return trav(nums , 0, temp);
    }

public int trav(int[] A, int i, ArrayList<Integer> temp){
    if( i >= A.length){
int out = 0;

for(int n : temp) out ^= n;
return out;
    }

temp.add(A[i]);
int include = trav(A , i + 1, temp);

temp.removeLast();
int exclude = trav(A , i + 1, temp);

return include + exclude;
}

}