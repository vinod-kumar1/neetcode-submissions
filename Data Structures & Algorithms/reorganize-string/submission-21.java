class Node{
char c;
int freq;

Node(char ch){
    this.c = ch;
    this.freq = 0;
}

}

class Solution {
    public String reorganizeString(String s) {
int max = 0;

HashMap<Character , Node> map = new HashMap<>();
for(char c : s.toCharArray()){
if(!map.containsKey(c)) map.put(c , new Node(c));
map.get(c).freq++;
max = Math.max(max , map.get(c).freq);
}
if(max > (s.length() + 1) / 2) return "";

StringBuilder res = new StringBuilder();
PriorityQueue<Node> pq = new PriorityQueue<>((b , a) -> Integer.compare(a.freq , b.freq));
for(Node node : map.values()) pq.offer(node);
Node prev = null;

while(!pq.isEmpty()) {

    Node node = pq.poll();

    res.append(node.c);
    node.freq--;

    if(prev != null && prev.freq > 0)
        pq.offer(prev);

    prev = node;
}

return res.toString();

}
}