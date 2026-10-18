class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : hand) map.put(n , map.getOrDefault(n, 0) + 1);
    if(hand.length % groupSize != 0) return false;

while(map.size() > 0){
    for(int i = 0; i <= 1000; i++){
        if(map.containsKey(i)){
         
       int cursize = 0;
       int n = i;

       for(int j = 0; j < groupSize; j++){
        if(!map.containsKey(n)) return false;
        cursize++;
        map.put(n , map.get(n) - 1);
        if(map.get(n) <= 0) map.remove(n);
        n++;
        if(cursize == groupSize) break;
       }

            break;
        }
    }
}

return true;

    }
}
