class Node{
int key,val;
Node prev,next;

Node(int k, int v){
    this.key = k;
    this.val = v;
}

}

class MyHashMap {
Node head;
Node tail;

    public MyHashMap() {
        head = null;
        tail = null;
    }
    
    public void put(int key, int value) {
        Node node = new Node(key, value);

        if(head == null){
         head = node;
         tail = node;
        }
        else{
            Node cur = head;
            boolean found = false;
            while(cur != null){
                if(cur.key == key){
                    cur.val = value;
                    found = true;
                    break;
                }
                if(key < cur.key) {
                    insertAt(cur , node);
                    found = true;
                    break;
                }
                cur = cur.next;
            }

            if(!found){
                node.prev = tail;
                tail.next = node;
                tail = node;
            }
        }
    }
    
public void insertAt(Node A, Node B){
    if(A.prev == null){
        head.prev = B;
        B.next = head;
        head = B;
    }
    else if(A.next == null){
        tail.next = B;
        B.prev = tail;
        tail = B;
    }
    else{
        Node prev = A.prev;
        A.prev = null;
        prev.next = null;

        B.prev = prev;
        prev.next = B;

        B.next = A;
        A.prev = B;

    }
}

    public int get(int key) {
        Node cur = head;


        while(cur != null){
            if(cur.key == key) return cur.val;
            cur = cur.next;
        }

        return -1;
    }
    
    public void remove(int key) {
        Node cur = head;
if(head != null && head.next == null && head.prev == null){
                    if(head.key == key){
                        head = null;
                        tail = null;
                    }
                    return;
                    
                }

        while(cur != null){
            if(cur.key == key){
                 if(cur.prev == null){
                    Node next = head.next;
                    head.next = null;
                    next.prev = null;
                    head = next;
                }
                else if(cur.next == null){
                    Node prev = tail.prev;
                    tail.prev = null;
                    prev.next = null;
                    tail = prev;
                }
                else{
                    cur.next.prev = cur.prev;
                    cur.prev.next = cur.next;
                }

                cur.next = null;
                cur.prev = null;
                break;
            }
            cur = cur.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */