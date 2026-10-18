class TimeMap {
HashMap<String , ArrayList<String[]>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(map.containsKey(key)){
            map.get(key).add(new String[] {value , timestamp + ""});
        }
        else {
            ArrayList<String[]> temp = new ArrayList<>();
            temp.add(new String[] {value , timestamp + ""});
            // temp.add(21);
            map.put(key , temp);
        }
        
        }
    
    public String get(String key, int timestamp) {
     if(map.containsKey(key)){
ArrayList<String[]> arr = map.get(key);
for(int i = arr.size()-1; i >=0; i--){
    if(Integer.parseInt(arr.get(i)[1]) <= timestamp) return arr.get(i)[0];
}
return "";
    }
     else return "";
    }
}