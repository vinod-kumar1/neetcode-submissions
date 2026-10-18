class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(groupSize == 1) return true;
        
        int len = hand.length;
        
        if(len % groupSize != 0) return false;

HashMap<Integer, Integer> map = new HashMap<>();

for(int n : hand) map.put( n , map.getOrDefault(n, 0) + 1);

while(map.size() > 0){
    for(int n : hand){
        if(map.containsKey(n)){
        int k = n;
        while(map.containsKey(k - 1)) k = k - 1;
        int s = k;
        int cur = 1;
        for(int i=0; i < groupSize; i++){
            if(map.containsKey(k + 1)) k = k + 1;
            cur++;
            if(cur == groupSize) break;
        }
        if(cur != groupSize) return false;
        else{
            for(int i = 0; i < groupSize; i++){
               if(map.containsKey(s)) map.put(s , map.get(s) - 1);
               else return false;
               if(map.get(s) <= 0) map.remove(s);
                s++;
            }

        } 
            break;
        }
    }
}

return true;

    }
}
