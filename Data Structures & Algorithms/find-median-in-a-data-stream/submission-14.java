class MedianFinder {
PriorityQueue<Integer> max;
PriorityQueue<Integer> min;

    public MedianFinder() {
max = new PriorityQueue<>(Collections.reverseOrder());        
min = new PriorityQueue<>();        
    }
    
    public void addNum(int num) {
    max.offer(num);

    if(!min.isEmpty() && max.peek() > min.peek()) min.offer(max.poll());
    
    if(max.size() > min.size() + 1) min.offer(max.poll());
    else if(min.size() > max.size()) max.offer(min.poll());

    }
    
    public double findMedian() {
     int n = max.size() + min.size();
     if(n % 2 == 0) return (max.peek() + min.peek()) / 2.0;    
    return 1.0 * max.peek();
    }
}
