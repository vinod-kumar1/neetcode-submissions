class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    ArrayList<Integer>[] arr = new ArrayList[nums.length+1];

    for (int n = 0; n < arr.length; n++)
      arr[n] = new ArrayList<>();

    for (int n : nums)
      map.put(n, map.getOrDefault(n, 0) + 1);

    for (Map.Entry<Integer, Integer> entry : map.entrySet())
      arr[entry.getValue()].add(entry.getKey());

    int[] output = new int[k];
    int curIndex = 0;

    for (int n = arr.length - 1; n >= 0; n--) {
      ArrayList<Integer> cur = arr[n];
      if (cur.size() == 0)
        continue;
      else {
        for (int t : cur) {
          output[curIndex] = t;
          k--;
          curIndex++;
          if (k <= 0)
            return output;
        }
      }
    }
return new int[0];
  
    
    }
}
