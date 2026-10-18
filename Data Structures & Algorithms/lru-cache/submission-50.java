class LRUCache {
LinkedHashMap<Integer, Integer> lhm;

    public LRUCache(int capacity) {

this.lhm = new LinkedHashMap<>(capacity , 0.75f, true){
    protected boolean removeEldestEntry(Map.Entry eldest){
        return size() > capacity;
    }
};        
    }
    
    public int get(int key) {
     return lhm.getOrDefault(key, -1);     
    }
    
    public void put(int key, int value) {
        lhm.put(key ,value);
    }
}
