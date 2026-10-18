class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      int len = nums.length;
HashMap<Integer, Integer> map = new HashMap<>();
for(int n : nums) map.put(n , map.getOrDefault(n, 0) + 1);

ArrayList<ArrayList<Integer>> temp = new ArrayList<>();
for(int i=0; i <= len; i++) temp.add(new ArrayList<Integer>());

for(int n : map.keySet()){
  temp.get(map.get(n)).add(n);
}

int res[] = new int[k];
int idx = 0;

for(int i=len; i >= 1 && idx < k; i--){
if(temp.get(i).size() > 0){
for(int n : temp.get(i)) res[idx++] = n;  
}
}

return res;
    }
}
