class Node{
int t;
String v;

Node(int timestamp , String value){
    this.t = timestamp;
    this.v = value;
}

}

class TimeMap {
HashMap<String, ArrayList<Node>> map;

    public TimeMap() {
map = new HashMap<>();        
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)) map.put(key , new ArrayList<Node>());
        map.get(key).add(new Node(timestamp , value));
    }
    
    public String get(String key, int timestamp) {
if(!map.containsKey(key)) return "";        

ArrayList<Node> temp = map.get(key);
int l = 0, r = temp.size() - 1;
String val = "";

while(l <= r){
int m = l + ((r - l) / 2);
Node node = temp.get(m);

int n = temp.get(m).t;
if(n == timestamp) return node.v;


if(timestamp < n) {
    r = m - 1;
}
else if(timestamp > n) {
               val = node.v;
    l = m + 1;
}
else return temp.get(m).v;

}

return val;
    }
}
