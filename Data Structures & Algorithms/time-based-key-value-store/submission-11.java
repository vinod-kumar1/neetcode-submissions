class TimeMap {
HashMap<String, HashMap<Integer, String>> map;

    public TimeMap() {
map = new HashMap<>();        
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)) map.put(key , new HashMap<>());
        map.get(key).put(timestamp , value);
    }
    
    public String get(String key, int timestamp) {
if(!map.containsKey(key)) return "";        

for(int i = timestamp; i >= 0; i--){
if(map.get(key).containsKey(i)) return map.get(key).get(i);
}

return "";

    }
}
