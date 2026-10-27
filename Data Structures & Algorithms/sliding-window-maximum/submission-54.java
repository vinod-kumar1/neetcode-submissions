class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
     int l = 0 , r = 0, len = nums.length;
Deque<Integer> dq = new ArrayDeque<>();
int res[] = new int[len - k + 1];
int idx = 0;

     while(r < len){
     int n = nums[r];
      if(!dq.isEmpty() && r - dq.getFirst() >= k) dq.removeFirst();
      while(!dq.isEmpty() && nums[dq.getLast()] <= n) dq.removeLast();
      dq.addLast(r);

      if(r - l + 1 >= k) res[idx++] = nums[dq.getFirst()];
      r++;
     }   

return res;
    }
}