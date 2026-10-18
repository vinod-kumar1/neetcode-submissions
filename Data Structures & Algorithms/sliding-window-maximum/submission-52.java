class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;

        int res[] = new int[len - k + 1];
    int idx = 0;
Deque<Integer> dq = new ArrayDeque<>();
    
    int l = 0, r = 0;
  for(int i=0; i < len; i++){

        int n = nums[i];
        if(!dq.isEmpty() && dq.getFirst() <= i - k) dq.removeFirst(); //
// lets say the l = 0, and we're at index 3, ans window size is also 3
// now - > 3(curind) - 3 (window size) <= 0(left) then we pop from left
        while(!dq.isEmpty() && nums[dq.getLast()] < n) dq.removeLast();
        dq.addLast(i);
        
        if(i >= k-1) res[idx++] = nums[dq.getFirst()];

  }

return res;    
    }
}
