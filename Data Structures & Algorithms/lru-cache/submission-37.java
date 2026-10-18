class Node{
  int k,v;
  Node prev = null;
  Node next = null;

public Node(int k, int v){
  this.k = k;
  this.v = v;
}
}

class LRUCache {
int cap = 0;
Node left = new Node(-1, - 1);
Node right = new Node(-1, -1);
Map<Integer, Node> map;
   
    public LRUCache(int capacity) {
        this.cap = capacity;
        left.next = right;
        right.prev = left;
        map = new HashMap<Integer , Node>();
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
          Node temp = map.get(key);
          removeFromLinkedList(temp);
          addNodeAtHead(temp);
          map.put(key, temp);
        return temp.v;
        }
        else return -1;
    }
    
public void removeFromLinkedList(Node node){
  Node prev = node.prev;
  Node next = node.next;
  prev.next = next;
  next.prev = prev;
}

public void addNodeAtHead(Node node){
 Node leftNext = this.left.next;
 node.next = leftNext;
 leftNext.prev = node;
this.left.next = node;
node.prev = this.left;
}

public void put(int key, int value) {
if(map.containsKey(key)){
Node temp = map.get(key);

removeFromLinkedList(temp);
addNodeAtHead(temp);
temp.v = value;
map.put(key, temp);
} 
else {
Node temp = new Node(key, value);

if(map.size() + 1 > cap){
Node n = this.right.prev;
map.remove(n.k);
removeFromLinkedList(n);
addNodeAtHead(temp);
map.put(key ,temp);
}
else{
  addNodeAtHead(temp);
  map.put(key , temp);
}
} 

    }
}
