class Node{
    char c;
    int freq;

    Node(char ch , int freq){
        this.c = ch;
        this.freq = freq;
    }
}

class Solution {
    public String longestDiverseString(int a, int b, int c) {
        int tot= (a + b + c + 1);

        PriorityQueue<Node> pq = new PriorityQueue<>((x,y) -> Integer.compare(y.freq , x.freq));
       if(a > 0) pq.offer(new Node('a' , a));
      if(b > 0)  pq.offer(new Node('b' , b));
      if(c > 0)  pq.offer(new Node('c' , c));

        Node prev = null;
        StringBuilder res = new StringBuilder();

        while(!pq.isEmpty()) {
            Node temp = pq.poll();
            
            if(res.length() >= 2){
                char c1 = res.charAt(res.length() - 1);
                char c2 = res.charAt(res.length() - 2);
                
            if(temp.c == c1 && temp.c == c2){
                if(pq.isEmpty()) break;
                Node n2 = pq.poll();
                res.append(n2.c);
                n2.freq--;
                if(n2.freq > 0) pq.offer(n2);
            }
            else {
                 res.append(temp.c);
                temp.freq--;
            }
            }
            else{
                res.append(temp.c);
                temp.freq--;
            }

                if(temp.freq > 0) pq.offer(temp);
        }
         
        return  res.toString();
    }
}