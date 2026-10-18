class DLL{
    int key,val;
    DLL next,prev;

    DLL(int k, int v){
        this.key = k;
        this.val = v;
        this.next = null;
        this.prev = null;
    }
}

class LRUCache {
HashMap<Integer, DLL> map;
int cap;
DLL head;
DLL tail;

    public LRUCache(int capacity) {
       this.cap = capacity;
       map = new HashMap<>();
       this.head = null;
       this.tail = null;        
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
         DLL node = map.get(key);
         removeNode(node);
         addToHead(node);
         return node.val;
        }

        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            DLL node = map.get(key);
            node.val = value;

            removeNode(node);
            addToHead(node);
        }        
        else{
            DLL newNode = new DLL(key ,value);

            if(map.size() >= this.cap){
                int k  = tail.key;
                removeNode(tail);
                map.remove(k);
            }
          map.put(key , newNode);
            addToHead(newNode);
        }
    }

public void removeNode(DLL node){
    if(node.next == null && node.prev == null){
        head = null;
        tail = null;
        return;
    }
    
    if(node.next == null) tail = node.prev;
    else if(node.prev == null) head = head.next;

    if(node.next != null) node.next.prev = node.prev;
    if(node.prev != null) node.prev.next = node.next;


    node.next = null;
    node.prev = null;
}

public void addToHead(DLL node){
    if(head == null){
        head = node;
        tail = node;
    }
    else{
        node.next = head;
        head.prev = node;
        head = node;
    }
}

}
