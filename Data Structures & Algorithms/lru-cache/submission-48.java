class DLL {
    int key, val;
    DLL prev, next;

    DLL(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

class LRUCache {
    int size = 0, cap = 0;
    DLL head = null;
    DLL tail = head;

    HashMap<Integer, DLL> map;
    public LRUCache(int capacity) {
        this.cap = capacity;
        this.map = new HashMap<>();
    }

    public int get(int key) {
if(!map.containsKey(key)) return -1;
DLL node = map.get(key);

if(node != head){
    DLL detachNode = removeNode(node);
    addToHead(detachNode);
}

return node.val;
    }

public void addToHead(DLL node){
    if(head == null){
        head = node;
        tail = node;
    }
    else{
      head.prev = node;
      node.next = head;
      head = node;
    }
}

    public DLL removeNode(DLL node){
        if(node == head){
            DLL next = node.next;
            node.next = null;
            node.prev = null;
            head = next;
        }
        else if(node == tail){
               DLL prev = node.prev;
                node.prev = null;
                prev.next = null;
                tail = prev;
        }
        else{
            node.next.prev = node.prev;
            node.prev.next = node.next;
        }

            node.next = null;
            node.prev = null;

        return node;
    }

    public void put(int key, int value) {
if(map.containsKey(key)){
    DLL node = map.get(key);
    node.val = value;
    
    if(node != head){
        DLL detachNode = removeNode(node);
        addToHead(detachNode);
    }
}
else{
this.size++;
DLL node = new DLL(key , value);
map.put(key , node);

if(this.size > cap){
    DLL tailNode = tail;
    removeNode(tailNode);
    map.remove(tailNode.key);
}

addToHead(node);
}
    }
}
