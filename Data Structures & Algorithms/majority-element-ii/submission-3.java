class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n , map.getOrDefault(n, 0) + 1);
            if(map.size() > 2){
                HashMap<Integer, Integer> temp = new HashMap<>();

                for(Map.Entry<Integer, Integer> entry : map.entrySet()){
    if(entry.getValue() > 1) temp.put(entry.getKey() , entry.getValue() - 1);
                } 
                map = temp;
            }
        }
int len = nums.length;
ArrayList<Integer> res = new ArrayList<>();

for(int n : map.keySet()){
    int count = 0;

    for(int k : nums){
        if(k == n) count++;
    }
if(count > (len / 3)) res.add(n);
}

return res;
    }
}
// [1,2,3,4,    5,6,7,7,7]
/*
5
2
3
2 2 
*/