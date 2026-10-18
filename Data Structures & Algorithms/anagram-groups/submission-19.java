class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            int[] temp = new int[26];
            for(char c : s.toCharArray()) temp[c - 'a']++;
            String temp2 = Arrays.toString(temp);

            if(!map.containsKey(temp2)) map.put(temp2 , new ArrayList<>());

            map.get(temp2).add(s);
        }

List<List<String>> res = new ArrayList<>();

for(List<String> temp3 : map.values()) res.add(temp3);
return res;

    }
}
