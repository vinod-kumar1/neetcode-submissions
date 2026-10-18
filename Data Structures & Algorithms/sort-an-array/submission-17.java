class Solution {
    public int[] sortArray(int[] nums) {
         trav(0, nums.length - 1, nums);
    return nums;
    }

public void trav(int l, int r, int[] A){
if(l >= r) return;

int m = ((r + l) / 2);

    trav(l , m , A);
    trav(m + 1, r, A);

merge(l , m , r , A);
}

public void merge(int l, int m, int r, int[] A){
    int i = l, j = m + 1;
ArrayList<Integer> temp = new ArrayList<>();

while(i <= m && j <= r){
    if(A[i] <= A[j]) temp.add(A[i++]);
    else temp.add(A[j++]);
}

while(i <= m) temp.add(A[i++]);
while(j <= r) temp.add(A[j++]);

int idx = 0;

for(int k = l; k <= r; k++){
A[k] = temp.get(idx++);
}

}

}