class Pair{
int time;
String val;

Pair(int t, String s){
    this.time = t;
    this.val = s;
}

}

class TimeMap {
HashMap<String, ArrayList<Pair>> map;

    public TimeMap() {
map = new HashMap<>();        
    }
    
    public void set(String key, String value, int timestamp) {
 Pair p = new Pair(timestamp , value);

 if(!map.containsKey(key)) {
    ArrayList<Pair> temp = new ArrayList<Pair>();
    Collections.sort(temp ,  new Comparator<Pair>() {
    @Override
    public int compare(Pair o1, Pair o2) {
        return Integer.compare(o1.time , o2.time); // Ascending
    }
});
    map.put(key , temp);
 }      
map.get(key).add(p);
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        int len = map.get(key).size();
        int l = 0, r = len-1;
ArrayList<Pair> temp = map.get(key);
String cur = "";

        while(l <= r){
            int m = l + ((r-l)/2);
            Pair item = temp.get(m);

            if(timestamp == item.time) return item.val;
            else if(item.time < timestamp){
                cur = item.val;
                l = m+1;
            }
            else r = m-1;    
        }

return cur;
    }
}
