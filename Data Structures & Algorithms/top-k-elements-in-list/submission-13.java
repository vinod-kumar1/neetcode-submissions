class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer, Integer> map = new HashMap<>();

       for(int n : nums) map.put(n , map.getOrDefault(n, 0) + 1);

ArrayList<ArrayList<Integer>> freq = new ArrayList<>();
for(int i = 0; i <= nums.length; i++) freq.add(new ArrayList<>());

for(int n : map.keySet()){
    int v = map.get(n);
    freq.get(v).add(n);
}

int[] res = new int[k];
int idx = 0;

for(int i = freq.size() - 1; i >= 0 && idx < k; i--){
for(int s : freq.get(i)) res[idx++] = s;
}

return res;
    }
}
