
class Dll {
    int key, val;
    Dll prev, next;

    Dll(int k, int v) {
        this.key = k;
        this.val = v;
        prev = null;
        next = null;
    }

    public void setVal(int v) {
        this.val = v;
    }

    public int getKey() {
        return this.key;
    }

}

class LRUCache {
    HashMap<Integer, Dll> map;
    int size;
    Dll head;
    Dll tail;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        this.size = capacity;
        head = null;
        tail = null;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            int n = map.get(key).val;
            Dll node = map.get(key);

            if (node != head) {
                Dll detachNode = removeNode(node);
                addToHead(detachNode);
            }
            return n;

        }


        return -1;
    }

    public void put(int key, int value) {

        if (map.containsKey(key)) {
            Dll node = map.get(key);
            node.setVal(value);

            if (node == head) return;

            if (head == null) {
                head = node;
                tail = head;
            } else if (node == tail) {
                Dll detachedNode = removeNode(tail);
                addToHead(detachedNode);
            } else {
                node.prev.next = node.next;
                node.next.prev = node.prev;
                node.prev = null;
                node.next = null;
                addToHead(node);
            }
        } else {
            Dll node = new Dll(key, value);
            addToHead(node);
            map.put(key, node);

            if (map.size() > this.size) {
                int k = tail.getKey();
                map.remove(k);
                removeNode(tail);
            }

        }
    }

    public Dll removeNode(Dll node) {
        if (node == head) {
            Dll nextNode = head.next;
            head.next = null;
            nextNode.prev = null;
            head = nextNode;
        } else if (node == tail) {
            Dll prevNode = tail.prev;
            tail.prev = null;
            prevNode.next = null;
            tail = prevNode;
        } else {
            node.next.prev = node.prev;
            node.prev.next = node.next;
        }

        node.next = null;
        node.prev = null;

        return node;
    }

    public void addToHead(Dll node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

}