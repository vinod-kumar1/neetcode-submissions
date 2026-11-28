class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int len = hand.length;
        if(len % groupSize != 0) return false;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int n : hand){
            map.put(n , map.getOrDefault(n, 0) + 1);
    max = Math.max(max , n);
        }
     
    
    int cur = 0;

    while(!map.isEmpty()){
        while(!map.containsKey(cur) && cur <= max) cur++;
if(cur > max) return false;

    int temp = cur ;
    for(int i = 0; i < groupSize; i++){
     if(!map.containsKey(temp)) return false;
     map.put(temp , map.get(temp) - 1);
     if(map.get(temp) <= 0) map.remove(temp);
     temp++;
    }
    
    }
        
        return true;
        }

}
