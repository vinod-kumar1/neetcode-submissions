class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
     List<Integer> temp = new ArrayList<>();
     int sum = 0, l = 0, min = Integer.MAX_VALUE, r=0;
     List<Integer> res = new ArrayList<>();

        while(r < arr.length){
            temp.add(arr[r]);
            sum += Math.abs(x - arr[r]);
            System.out.println(sum);
            if(temp.size() == k){
if(sum < min){
min = sum;
res.clear();
for(int n : temp) res.add(n);
}
            sum -= Math.abs(x - arr[l]);
            temp.remove(temp.get(0));
            l++;
            }
 r++;
        }
return res;
    }
}