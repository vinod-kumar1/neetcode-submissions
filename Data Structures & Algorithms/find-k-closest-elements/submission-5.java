class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
     int sum = 0, l = 0, min = Integer.MAX_VALUE, r=0;
     int s=0,e=0;
     List<Integer> res = new ArrayList<>();
     int temp = 0;

        while(r < arr.length){
            temp++;
            sum += Math.abs(x - arr[r]);
            if(temp == k){
if(sum < min){
min = sum;
s = l;
e = r;
}
            sum -= Math.abs(x - arr[l]);
            temp--;
            l++;
            }
 r++;
        }
for(int ks=s ; ks <= e; ks++) res.add(arr[ks]);
return res;
    }
}