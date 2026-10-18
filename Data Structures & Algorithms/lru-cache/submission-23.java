class LRUCache {
Map<Integer , Integer> map;
int cap = 0;
ArrayDeque<Integer> deq = new ArrayDeque<>();

    public LRUCache(int capacity) {
map = new HashMap<Integer , Integer>();        
cap = capacity;
    }
    
    public int get(int key) {
Integer n = Integer.valueOf(key);
if(!deq.contains(n)) return -1;

while(deq.contains(n)) deq.remove(n);
while(deq.size() > cap) deq.removeFirst();
deq.addLast(key);

return map.get(key);
    }
    
    public void put(int key, int value) {
Integer n = Integer.valueOf(key);
while(deq.contains(n)) deq.remove(key);
deq.addLast(key);
map.put(key , value);
while(deq.size() > cap) deq.removeFirst();
    }
}
