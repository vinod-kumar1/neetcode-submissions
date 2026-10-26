class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

int l = 0;
int sum = 0;
int min = Integer.MAX_VALUE;
List<Integer> res = new ArrayList<>();
int len = arr.length;

for(int r = 0; r < len; r++){
    int n = arr[r];
sum += (Math.abs( n - x));

if(r - l + 1 == k){
if(sum < min){
res.clear();
for(int j = l; j <= r; j++) res.add(arr[j]);
min = sum;
}
sum -= (Math.abs(arr[l] - x));
l++;
}
}

return res;

}

}