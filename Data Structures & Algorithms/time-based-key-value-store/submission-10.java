class Pair{
    String val;
    int time;

    Pair(String v, int t){
        this.val = v;
        this.time = t;
    }
}

class TimeMap {
HashMap<String, ArrayList<Pair>> map;

    public TimeMap() {
       map = new HashMap<>();        
    }
    
    public void set(String key, String value, int timestamp) {
if(!map.containsKey(key))  map.put(key , new ArrayList<Pair>());
     map.get(key).add(new Pair(value, timestamp));      
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";

        ArrayList<Pair> temp = map.get(key);
        int l = 0, r = temp.size() - 1;
String res = "";

        while(l <= r){
            int m = l + ((r-l)/2);
            if(temp.get(m).time == timestamp) return temp.get(m).val;

            if(timestamp < temp.get(m).time){
        r = m - 1;        
            }
            else {
                l = m + 1;
        res = temp.get(m).val;
        }
        }
return res;

    }
}
