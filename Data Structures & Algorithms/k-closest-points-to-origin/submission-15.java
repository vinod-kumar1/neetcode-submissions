class Item{
double dis;
int[] temp;

Item(double d, int[] A){
this.temp = A;
this.dis = d;
}

}

class Solution {
    public int[][] kClosest(int[][] points, int k) {

PriorityQueue<Item> pq = new PriorityQueue<>((a,b) -> Double.compare(b.dis , a.dis));

for(int temp[] : points){
  double d = (double) Math.sqrt(1.0 * Math.pow(temp[0] , 2) + 1.0 * Math.pow(temp[1] , 2));
pq.offer(new Item(d , temp));

if(pq.size() > k) pq.poll();

}

int[][] res = new int[k][2];
int idx = 0;

while(!pq.isEmpty()){
 res[idx++] = pq.poll().temp;
}

return res;
    }
}
